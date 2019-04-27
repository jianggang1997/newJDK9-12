package com.siki.test;

import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

        List<String> strs = List.of("1","2");

        /**old toArray*/
        String[] strings = strs.toArray(new String[strs.size()]);
        for(String s : strings){
            System.out.print(s+"\t");
        }

        System.out.println();
        /**new toArray*/
        String[] strings1 = strs.toArray(String[]::new);
        for (String s : strings1){
            System.out.print(s + "\t" );
        }


//        strs.toArray(null);
    }
}
