package com.hz.reflect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 获取某个类的全部属性
 */
public class TestReflectFive implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz=Class.forName("com.hz.reflect.TestReflectFive");
        System.out.println("===============本类属性===============");
        //取得本类的全部属性
        Field[] field=clazz.getDeclaredFields();
        for (int i=0;i<field.length;i++){
            //权限修饰符
            int mo=field[i].getModifiers();
            String priv= Modifier.toString(mo);
            //属性类型
            Class<?> type=field[i].getType();
            System.out.println(priv+" "+type.getName()+" "+field[i].getName()+";");
        }

        System.out.println("==========实现的接口或者父类的属性==========");
        // 取得实现的接口或者父类的属性
        Field[] filed1 = clazz.getFields();
        for (int j = 0; j < filed1.length; j++) {
            // 权限修饰符
            int mo = filed1[j].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = filed1[j].getType();
            System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
        }
    }
}
