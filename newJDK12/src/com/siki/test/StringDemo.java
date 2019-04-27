package com.siki.test;

public class StringDemo {

    public static void main(String[] args) {
        /**transform*/

        String x = "siki";
        String transform = x.transform(string -> {
            //TODO
            return x + "\t edu";
        });
        System.out.println(transform);

        /**indent*/
        String a = "siki";
        String indent = a.indent(4);
        System.out.println(indent);
    }
}
