package com.jiawa.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * java11 DEMO
 *
 * @author panguanjing 2019-01-09
 **/
public class FilesDemo {

    public static void main(String[] args) throws IOException {
        String text = "Hello java11.";

        // 写入文本
        Files.writeString(Paths.get("hello.txt"), text);

        // 读取文本
        String readText = Files.readString(Paths.get("hello.txt"));
        System.out.println(text.equals(readText));

        // 删除文本
        Files.delete(Paths.get("hello.txt"));
    }
}
