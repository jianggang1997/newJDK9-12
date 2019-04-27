package com.siki.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

    public static void main(String[] args) throws IOException {
        /**
         *  return -1 就是两个文件的内容完全匹配。
         *  return >=0 就是两个文件内容匹配的长度
         */
        long mismatch = Files.mismatch(Path.of("D:\\siki\\test1.txt"), Path.of("D:\\siki\\test2.txt"));
        System.out.println(mismatch);
    }
}
