package com.jiawa.javastudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

/**
 * study longAdder
 *
 * @author panguanjing
 */
public class LongAdderStudy {
    public static void main(String[] args) {
        LongAdder counter = new LongAdder();
        ExecutorService executorService = new ThreadPoolExecutor(10, 10, 30, TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(1000), r -> {
            Thread t = new Thread(r);
            t.setName("LongAdder");
            t.setDaemon(true);
            return t;
        });

        int numberOfThreads = 4;
        int numberOfIncrements = 100;

        Runnable incrementAction = () -> IntStream.range(0, numberOfIncrements).forEach(i -> counter.increment());

        for (int i = 0; i < numberOfThreads; i++) {
            executorService.execute(incrementAction);
        }

        executorService.shutdown();
    }
}
