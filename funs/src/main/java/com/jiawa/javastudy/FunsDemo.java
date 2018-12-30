package com.jiawa.javastudy;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * FunsDemo
 *
 * @author panguanjing 2018-12-29
 **/
public class FunsDemo {

    public static void main(String[] args) {
        Random random = new Random();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String start = simpleDateFormat.format(date) + "000000";
        String end = simpleDateFormat.format(date) + "235959";
        Long startLong = Long.parseLong(start);
        Long endLong = Long.parseLong(end);
        Map<Double, Integer> map = new TreeMap<Double, Integer>();
        for (Long i = startLong; i < endLong; i = i + 1) {
            double gau = random.nextGaussian();
            double gauKey = Math.round(gau * 10) / 10.0;
            int n = (map.get(gauKey) == null) ? 0 : map.get(gauKey);
            map.put(gauKey, n + 1);
        }
        List<Guassian> list = new ArrayList<>();
        Integer startYear = 1970;
        for (Map.Entry<Double, Integer> e : map.entrySet()) {
            Guassian guassian = new Guassian();
            guassian.setYear(String.valueOf(startYear));
            guassian.setValue(e.getValue());
            startYear++;
            list.add(guassian);
        }
        System.out.println(JSON.toJSONString(list, true));
    }
}
