package com.siki.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

    public static void main(String[] args) throws IOException {
        /**readString*/
        String str = Files.readString(Paths.get("E:\\siki.txt"));
        System.out.println(str);
        String str2 = Files.readString(Paths.get("E:\\siki.txt"), Charset.forName("UTF-8"));
        System.out.println(str2);

        /**writeString*/
        String str3 = "WelCome  Beijing";
        Path path = Files.writeString(Paths.get("E:\\siki2.txt"), str3);
        System.out.println(path.toString());

        Path path1 = Files.writeString(Paths.get("E:\\siki3.txt"), str3,Charset.forName("UTF-8"));
        System.out.println(path1.toString());
    }
}
