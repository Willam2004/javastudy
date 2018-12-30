package com.jiawa.javastudy;

import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * @author panguanjing 2018-12-29
 **/
public class TestGaussian {
    public static void main(String[] args) throws IOException {
        Map<Double, Integer> map = new TreeMap<Double, Integer>();
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            double gau = r.nextGaussian();
            double gauKey = Math.round(gau * 10) / 10.0;
            int n = (map.get(gauKey) == null) ? 0 : map.get(gauKey);
            map.put(gauKey, n + 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.printf("%f %d%n", entry.getKey(), entry.getValue());
        }
    }
}
