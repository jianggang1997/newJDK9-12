package com.siki.test;

import java.util.stream.Stream;

public class StringDemo {

    public static void main(String[] args) {
        /**strip()*/
        String str1 = "  Hello siki edu!\u3000\u3000";

        String strTrim1 = str1.trim();
        System.out.println(strTrim1+"--->");
        System.out.println(strTrim1.length());

        String strStrip1 = str1.strip();
        System.out.println(strStrip1+"--->");
    System.out.println(strStrip1.length());+

        /**isBlank*/
        String str2 = "    ";
        boolean isBlank = str2.isBlank();
        System.out.println(isBlank);
        
        /**lines*/
        String str3 = "first Line.\nsecond Line.\nthrid Line.";
        Stream<String> stream = str3.lines();
        stream.forEach(System.out::println);

        /**repeat*/
        String str4 = "siki \t";
        String repeat = str4.repeat(10);
        System.out.println(repeat);

    }

}
