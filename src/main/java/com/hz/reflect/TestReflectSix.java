package com.hz.reflect;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author huangzhu
 * @version 1.0
 * @date 2017/6/27
 * @description 获取某个类的全部方法
 */
public class TestReflectSix implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz=Class.forName("com.hz.reflect.TestReflectSix");
        Method[] method=clazz.getMethods();
        for(int i=0;i<method.length;++i){
            Class<?> returnType=method[i].getReturnType();
            Class<?> param[]=method[i].getParameterTypes();
            int temp=method[i].getModifiers();
            System.out.print(Modifier.toString(temp)+" ");
            System.out.print(returnType.getName()+" ");
            System.out.print(method[i].getName()+" ");
            System.out.print("(");
            for(int j=0;j<param.length;++j){
                System.out.print(param[j].getName()+" "+"arg"+j);
                if(j<param.length-1){
                    System.out.print(",");
                }
            }
            Class<?> exce[]=method[i].getExceptionTypes();
            if(exce.length>0){
                System.out.print(") throws ");
                for(int k=0;k<exce.length;++k){
                    System.out.print(exce[k].getName()+" ");
                    if(k<exce.length-1){
                        System.out.print(",");
                    }
                }
            }else {
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
