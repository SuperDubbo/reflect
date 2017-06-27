package com.hz.reflect;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 实例化Class类对象
 */
public class TestReflectTwo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1=null;
        Class<?> class2=null;
        Class<?> class3=null;
        //一般采用这种形式
        class1=Class.forName("com.hz.reflect.TestReflectTwo");
        class2=new TestReflectTwo().getClass();
        class3=TestReflectTwo.class;
        System.out.println("类名称 "+class1.getName());
        System.out.println("类名称 "+class2.getName());
        System.out.println("类名称 "+class3.getName());
    }
}
