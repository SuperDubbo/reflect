package com.hz.reflect;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 通过一个对象获得完整的包名和类名
 */
public class TestReflectOne {
    public static void main(String[] args) {
        TestReflectOne testReflect=new TestReflectOne();
        System.out.println(testReflect.getClass().getName());
        //打印出:com.hz.reflect.TestReflectOne
    }
}
