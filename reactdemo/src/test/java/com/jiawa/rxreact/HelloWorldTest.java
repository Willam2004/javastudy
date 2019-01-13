package com.jiawa.rxreact;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * HelloWorldTest
 *
 * @author panguanjing 2019-01-12
 **/
public class HelloWorldTest {
    public static void main(String[] args) {
        Flowable.just("Hello world").subscribe(System.out::println);
        Observable<String> o = Observable.fromArray("a", "b", "c");
        o.subscribe(System.out::println);
        Observable<String> justTest = Observable.just("Greate RxJava");
        justTest.subscribe();
    }
}
