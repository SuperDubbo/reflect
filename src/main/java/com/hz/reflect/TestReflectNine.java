package com.hz.reflect;

import java.lang.reflect.Field;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 通过反射机制操作某个类的属性
 */
public class TestReflectNine {
    private String proprety=null;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> clazz=Class.forName("com.hz.reflect.TestReflectNine");
        Object obj=clazz.newInstance();
        //可以直接对private的属性赋值
        Field field=clazz.getDeclaredField("proprety");
        field.setAccessible(true);
        field.set(obj,"Java反射机制");
        System.out.println(field.get(obj));
    }
}
