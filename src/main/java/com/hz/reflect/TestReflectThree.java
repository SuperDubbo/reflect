package com.hz.reflect;

import java.io.Serializable;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 获取一个对象的父类与实现的接口
 */
public class TestReflectThree implements Serializable{
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz=Class.forName("com.hz.reflect.TestReflectThree");
        //取得父类
        Class<?> parentClass=clazz.getSuperclass();
        System.out.println("clazz的父类为:"+parentClass.getName());
        //获取所有的接口
        Class<?> intes[]=clazz.getInterfaces();
        System.out.println("clazz实现的接口有:");
        for(int i=0;i<intes.length;i++){
            System.out.println((i+1)+": "+intes[i].getName());
        }
    }
}
