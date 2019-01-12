package com.jiawa.rxreact;

import io.reactivex.Flowable;

/**
 * HelloWorldTest
 *
 * @author panguanjing 2019-01-12
 **/
public class HelloWorldTest {
    public static void main(String[] args) {
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}
