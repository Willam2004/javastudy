package com.jiawa.java11;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合类的java11的操作
 *
 * @author panguanjing 2019-01-06
 **/
public class CollectionExamples {

    public static void main(String[] args) {
        //快速创建一个map
        Map<String, String> map = Map.of("a", "a1", "b", "b1");
        Set<String> set = Set.of();
        Set<String> bar = Set.of("abc", "bc", "def");
        // 空列表，数据类型为 Object
        List immutableList = List.of();
        // 创建 List<String>
        var foo = List.of("biezhi", "github", "foo");
        Map<Integer, String> map1 = Map.ofEntries(
            Map.entry(20, "abc"),
            Map.entry(1, "gdd"),
            Map.entry(111, "ggg")
        );
    }
}
