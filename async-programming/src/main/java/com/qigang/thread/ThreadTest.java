package com.qigang.thread;

public class ThreadTest {
    public static void main(String[] args) {
        //RunnableImpl ri=new RunnableImpl();
        SynchronizedRunnableImpl ri=new SynchronizedRunnableImpl();
        Thread thread1=new Thread(ri,"T1");
        Thread thread2=new Thread(ri,"T2");
        thread1.start();
        thread2.start();
    }
}
