package com.jiawa.rxreact;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

/**
 * second demo
 *
 * @author panguanjing 2019-01-16
 **/
public class ReactSecond {
    public static void main(String[] args) {
        ObservableOnSubscribe subscribe = emitter -> {
        };
        Observable observable = Observable.create(subscribe);
        observable.subscribe();
    }
}
