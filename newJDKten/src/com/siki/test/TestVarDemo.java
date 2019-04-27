package com.siki.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestVarDemo {

    public static void main(String[] args) {

        /**jdk 10 old*/
        String str = "This is a string";
        /**jdk 10 var*/
        var strnew = "This is a string";
        System.out.println(strnew);

        test();
    }

    public static void test(){
        /**字面量推断*/
        var literal = "this is a literal";
        System.out.println(literal);
        /**自动推断方法返回值类型*/
        var res = resTest();
        System.out.println(res);
        /**循环局部变量使用类型推断*/
        for(var i = 0; i < 3 ; i ++){
            System.out.println(i);
        }
        /**结合泛型来使用局部变量推断*/
        /**常规*/
        List<String> strs = new ArrayList<>();
        strs.add("323");
        /**结合var*/
        var listVar = new ArrayList<>();
        listVar.add(1);
        listVar.add("1");
        /**指明泛型的类型*/
        var listVar2 = new ArrayList<String>();
//        listVar2.add(1);
        listVar2.add("1");


    }

    public static Integer resTest(){
        return 10;
    }



    /**var 不适用的场景*/


    /**类的成员变量*/

//    var test = "abc";

    /**方法的返回值类型*/
//    public static var test1(){
//        return "1221";
//    }

    /**类的构造器申明*/
//    public TestVarDemo(var a){
//
//    }

    /**方法的签名*/
//    public static void test2(var a){
//
//    }

    /**lambada*/

//    public static void test3(){
//        Runnable runnable = () ->{
//            System.out.println("this is a lambada");
//        };
//
////        var test = () -> {
////            System.out.println("this  is a lambada");
////        };
//        Arrays.asList("").forEach((var a)->{
//            System.out.println(a);-
//        });
//    }



}
