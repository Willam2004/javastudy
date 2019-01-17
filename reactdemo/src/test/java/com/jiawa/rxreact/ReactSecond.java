package com.jiawa.rxreact;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * second demo 1.Observable和Subscriber可以做任何事情
 * Observable可以是一个数据库查询，Subscriber用来显示查询结果；Observable可以是屏幕上的点击事件，Subscriber用来响应点击事件；Observable可以是一个网络请求，Subscriber
 * 用来显示请求结果。
 * <p>
 * 2.Observable和Subscriber是独立于中间的变换过程的。 在Observable和Subscriber中间可以增减任何数量的map。整个系统是高度可组合的，操作数据是一个很简单的过程。
 *
 * @author panguanjing 2019-01-16
 **/
public class ReactSecond {
    public static void main(String[] args) {
        ObservableOnSubscribe subscribe = emitter -> {
        };
        Observable observable = Observable.create(subscribe);
        observable.subscribe();

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription s) {
            }

            @Override
            public void onNext(String s) { System.out.println(s); }

            @Override
            public void onError(Throwable e) { }

            @Override
            public void onComplete() {

            }
        };
        Observable.just("Hello, world!")
            .map(s -> s + " -Dan")
            .subscribe(s -> System.out.println(s));

    }
}
