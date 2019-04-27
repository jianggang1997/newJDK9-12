package com.siki.httptwo.testTryResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {


    public static  void testTryResource(){

        /**old version*/
        FileReader reader = null;
        try {
            reader = new FileReader("c:/test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            System.out.print(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        /**JDK 7 */

        try {
            FileReader reader1 = new FileReader("c:/test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader1);
            try(BufferedReader bufferedReader1 = bufferedReader){
                System.out.println(bufferedReader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        /**JDK 9*/
        try {
            FileReader reader1 = new FileReader("c:/test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader1);
            try(bufferedReader){
                System.out.println(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
