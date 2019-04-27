package com.siki.httptwo.interfaceprivate;

public interface Demo {

    /**JDK 8 之前*/
    void oldMethod();

    /**JDK8*/
    static void staticMethod(){

    }

    /**JDK8*/
    default void defaultMethod(){

    }

    /**JDK9*/
    private void privateMethod(){

    }
}
