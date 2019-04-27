package com.siki.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<List<String>> collect = Stream.of(
                "siki java",
                "siki untiy",
                "kaka teacher",
                "lin  teacher"
        ).collect(Collectors.teeing(
                Collectors.filtering(n -> n.contains("siki"), Collectors.toList()),
                Collectors.filtering(n -> n.endsWith("teacher"), Collectors.toList()),
                (List<String> hasSiki, List<String> hasTeacher) -> List.of(hasSiki, hasTeacher)
        ));
        System.out.println(collect);
    }
}