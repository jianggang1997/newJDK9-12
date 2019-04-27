package com.siki.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo {

    public static void main(String[] args) {


        /**从已有集合中拷贝返回一个新集合--当被拷贝的集合已经是一个不可变集合的话，就直接返回这个不可变集合的引用
         * 也就是说这是一个浅拷贝*/

        List<String> strs = new ArrayList<>();
        strs.add("1");
        List<String> strsNew = List.copyOf(strs);
        strs.add("2");
        System.out.println(strs);
        System.out.println(strsNew);
        System.out.println(strs == strsNew);

        List<String> strs1 = List.of("1");
        List<String> strs1New = List.copyOf(strs1);
        System.out.println(strs1);
        System.out.println(strs1New);
        System.out.println(strs1 == strs1New);


        System.out.println("--------------------------");

        Set<String> strs2 = new HashSet<>();
        strs2.add("1");
        Set<String> strs2New = Set.copyOf(strs2);
        System.out.println(strs2);
        System.out.println(strs1New);
        System.out.println(strs2 == strs2New);

        Set<String> strs3 = Set.of("1");
        Set<String> strs3New = Set.copyOf(strs3);
        System.out.println(strs3);
        System.out.println(strs3New);
        System.out.println(strs3 == strs3New);


        Map<String,String> strs4 = new HashMap<>();
        strs4.put("1","2");
        Map<String, String> strs4New = Map.copyOf(strs4);
        System.out.println(strs4);
        System.out.println(strs4New);
        System.out.println(strs4 == strs4New);

        Map<String,String> strs5 = Map.of("1","2","3","4");
        Map<String, String> strs5New = Map.copyOf(strs5);
        System.out.println(strs5);
        System.out.println(strs5New);
        System.out.println(strs5 == strs5New);


        Stream<Integer> stream = Stream.iterate(0,x -> x <10,x -> x+1);
        List<Integer> integers = stream.collect(Collectors.toUnmodifiableList());
//        integers.add(1);
        System.out.println(integers);

        Stream<Integer> stream2 = Stream.iterate(0,x -> x <10,x -> x+1);
        Set<Integer> integers2 = stream2.collect(Collectors.toUnmodifiableSet());
        System.out.println(integers2);


        Stream<Integer> stream3 = Stream.iterate(0,x -> x <10,x -> x+1);
        Map<Integer,Integer> integer3 = stream3.collect(Collectors.toUnmodifiableMap(x -> {
            return x * 10;
        },x -> x+1));
        System.out.println(integer3);
    }
}
