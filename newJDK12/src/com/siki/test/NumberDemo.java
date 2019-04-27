package com.siki.test;


import java.text.NumberFormat;
import java.util.Locale;

public class NumberDemo {

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.CHINA,NumberFormat.Style.SHORT);
        System.out.println(format.format(1_0000));
        System.out.println(format.format(1L << 27));
        System.out.println(format.format(1L << 40));
    }
}
