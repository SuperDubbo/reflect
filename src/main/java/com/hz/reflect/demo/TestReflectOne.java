package com.hz.reflect.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 在泛型为Integer的ArrayList中存放一个String类型的对象。
 */
public class TestReflectOne {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Method method=list.getClass().getMethod("add",Object.class);
        method.invoke(list,"Java反射机制实例");
        System.out.println(list.get(0));
    }
}
