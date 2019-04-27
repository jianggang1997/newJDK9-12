package com.siki.httptwo.testStream;

import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        testDropWhile();
    }

    public static void testOfNullable(){
        String str = "123";
        Stream<String> str1 = Stream.ofNullable(str);
        str1.forEach(System.out::println);
    }

    public static void testInterate(){
        /**JDK 8*/
        Stream<Integer> stream1 = Stream.iterate(0,n->n+1).limit(10);
        stream1.forEach(System.out::print);

        /**JDK 9*/
        System.out.println();
        Stream<Integer> stream2 = Stream.iterate(0,n -> n < 10,n->n+1);
        stream2.forEach(System.out::print);
    }

    public static void testTakeWhile(){
        Stream<Integer> stream = Stream.of(0,1,2,3,4,5,6,3,8,9);
        Stream<Integer> newStream = stream.takeWhile(x -> x<5);
        newStream.forEach(System.out::print);
    }

    public static  void testDropWhile(){
        Stream<Integer> stream = Stream.of(0,1,2,3,4,5,6,3,8,9);
        Stream<Integer> newStream = stream.dropWhile(x-> x<5);
        newStream.forEach(System.out::print);
    }
}
