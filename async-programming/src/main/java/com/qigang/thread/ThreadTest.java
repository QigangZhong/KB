package com.qigang.thread;

public class ThreadTest {
    public static void main(String[] args) {
        //1. 测试实现runnable接口
        /*RunnableImpl ri=new RunnableImpl();
        Thread wrapperThread=new Thread(ri);
        wrapperThread.start();*/

        //2. 测试继承Thread基类
        SubThread subThread=new SubThread("sub");
        subThread.start();

        //3. 测试synchronized方法
        /*SynchronizedRunnableImpl ri=new SynchronizedRunnableImpl();
        Thread thread1=new Thread(ri,"T1");
        Thread thread2=new Thread(ri,"T2");
        thread1.start();
        thread2.start();*/
    }
}
