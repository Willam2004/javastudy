package com.jiawa.rxreact;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * FlowableTest
 *
 * @author panguanjing 2019-01-19
 **/
public class FlowableTest {

    @Test
    public void testFlow() {
        Flowable
            .create(new FlowableOnSubscribe<Integer>() {
                @Override
                public void subscribe(FlowableEmitter<Integer> e) throws Exception {
                    System.out.println("发射----> 1");
                    e.onNext(1);
                    System.out.println("发射----> 2");
                    e.onNext(2);
                    System.out.println("发射----> 3");
                    e.onNext(3);
                    System.out.println("发射----> 完成");
                    e.onComplete();
                }
            }, BackpressureStrategy.BUFFER) //create方法中多了一个BackpressureStrategy类型的参数
            .subscribeOn(Schedulers.newThread())//为上下游分别指定各自的线程
            .observeOn(Schedulers.newThread())
            .subscribe(new Subscriber<Integer>() {
                @Override
                public void onSubscribe(Subscription s) {   //onSubscribe回调的参数不是Disposable而是Subscription
                    s.request(Long.MAX_VALUE);            //注意此处，暂时先这么设置
                }

                @Override
                public void onNext(Integer integer) {
                    System.out.println("接收----> " + integer);
                }

                @Override
                public void onError(Throwable t) {
                }

                @Override
                public void onComplete() {
                    System.out.println("接收----> 完成");
                }
            });

    }

}
