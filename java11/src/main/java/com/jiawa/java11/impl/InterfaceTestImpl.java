package com.jiawa.java11.impl;

import com.jiawa.java11.InterfaceTest;

/**
 * 接口的视线
 *
 * @author panguanjing 2019-01-09
 **/
public class InterfaceTestImpl implements InterfaceTest {
    @Override
    public void normalInterfaceMethod() {
        InterfaceTest.staticMethod();
    }
}
