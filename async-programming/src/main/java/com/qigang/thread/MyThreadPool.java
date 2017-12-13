package com.qigang.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * http://www.cnblogs.com/dolphin0520/p/3932921.html
 */
public class MyThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                5,
                10,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());

        for(int i=0;i<15;i++){
            MyRunnable myRunnable = new MyRunnable(i);
            executor.execute(myRunnable);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+
                    "，队列中等待执行的任务数目："+executor.getQueue().size()+
                    "，已执行完别的任务数目："+executor.getCompletedTaskCount());
        }

        executor.shutdown();
    }
}

class MyRunnable implements Runnable {
    private int taskNum;

    public MyRunnable(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
