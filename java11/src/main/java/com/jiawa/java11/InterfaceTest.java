package com.jiawa.java11;

/**
 * Java9 支持向接口添加私有方法来解决这个问题。
 *
 * @author panguanjing 2019-01-09
 **/
public interface InterfaceTest {

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    // 普通方法
    void normalInterfaceMethod();

    default void defaultMethod() {
        init();
    }

    private void init() {
        System.out.println("init");
    }
}
