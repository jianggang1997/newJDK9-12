package com.siki.test;

public class SwitchDemo {

    public static void main(String[] args) {
        int a = 1;

        /**old*/
        switch (a){
            case 1:
                int x= 1;
                System.out.println("1");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("default");
        }


//        /**new*/
//        switch (a){
//            case 1 -> System.out.println("1");
//            case 2,3,4,5 -> System.out.println("2,3,4,5");
//            case 6 ->{
//                int x = 8;
//                System.out.println("6");
//            }
//            default -> System.out.println("default");
//        }
//
//        int x = switch(a){
//            case 1 -> 1;
//            case 2,3,4,5 -> 6;
//            case 6 ->99;
//            default -> 7;
        };

//        System.out.println(x);
//    }
}
