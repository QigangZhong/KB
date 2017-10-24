package com.qigang.thread;

public class SynchronizedRunnableImpl implements Runnable {
    private int num=10;

    /**
     * 通过synchronized签名来限制这个方法只能由一个线程独占执行
     */
    @Override
    public synchronized void run() {
        while(num>0){
            System.out.println(Thread.currentThread().getName()+": "+num);
            num--;
        }
    }
}
