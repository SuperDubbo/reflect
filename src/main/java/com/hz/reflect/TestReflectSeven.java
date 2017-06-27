package com.hz.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 通过反射机制调用某个类的方法
 */
public class TestReflectSeven {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz=Class.forName("com.hz.reflect.TestReflectSeven");
        //调用TestReflectSeven类中的reflect1方法
        Method method=clazz.getMethod("reflect1");
        method.invoke(clazz.newInstance());
        //Java 反射机制 - 调用某个类的方法1.
        //调用TestReflectSeven的reflect2方法
        method=clazz.getMethod("reflect2",int.class,String.class);
        method.invoke(clazz.newInstance(),20,"hz");
    }

    public void reflect1(){
        System.out.println("Java 反射机制 - 调用某个类的方法1.");
    }

    public void reflect2(int age,String name){
        System.out.println("Java 反射机制 - 调用某个类的方法2.");
        System.out.println("age -> "+age+".name -> "+name);
    }
}
