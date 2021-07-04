package org.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class CyclicBarrierT {


    public static void main(String[] args) {

        //最后执行的线程执行该方法的回调
        CyclicBarrier cb = new CyclicBarrier(3, () -> {
            log.info("全部到齐");
        });

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Thread_01(cb));
        }
    }

    @Slf4j
    static class Thread_01 implements Runnable {
        CyclicBarrier cyclicBarrier;

        public Thread_01(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @lombok.SneakyThrows
        @Override
        public void run() {
            log.info("开始执行");
            TimeUnit.SECONDS.sleep(new Random().nextInt(3));
            log.info("执行完毕");
            cyclicBarrier.await();
        }
    }


}
