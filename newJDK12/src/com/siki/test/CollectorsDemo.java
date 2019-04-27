package com.siki.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<List<String>> collect = Stream.of(
                "siki java",
                "kaka teacher",
                "siki fed",
                "lin teacher"
        ).collect(Collectors.teeing(
                /**搜集包含siki字符串的字符串*/
                Collectors.filtering(n -> n.contains("siki"), Collectors.toList()),
                /**搜集以teacher结尾的字符串*/
                Collectors.filtering(n -> n.endsWith("teacher"), Collectors.toList()),
                /**对上面两个搜集的结果进行合并*/
                (List<String> hasSiki, List<String> endTeacher) -> List.of(hasSiki, endTeacher)
        ));

        System.out.println(collect);


//        String a = "dasdsadsads" +
//                "adsdasdwqe" +
//                "wqe" +
//                "qe";
//        String b = "dsadsadsadsada
//                sdsadadasdad";
    }
}
