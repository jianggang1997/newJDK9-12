package com.siki.httptwo.TestCollection;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        /**JDK8 创建不可变集合*/
        List<String> strList = Collections.unmodifiableList(new ArrayList<>());
        List<String> strListLink = Collections.unmodifiableList(new LinkedList<>());
        Set<String> setList = Collections.unmodifiableSet(new HashSet<>());
        Map<String,String> mapMap = Collections.unmodifiableMap(new HashMap<>());


        /**JDK9 创建不可变集合*/
        List<String> strListnew = List.of("1","3");
        Set<String> setnew = Set.of("1","2");
        Map<String,String> mapnew = Map.of("a","1","b","2");


        List<String> commonList = new ArrayList<>();


        commonList.add("a");
    }
}
