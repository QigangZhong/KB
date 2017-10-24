package com.qigang.thread;

/**
 * 通过继承Thread类来实现线程可执行的方法
 */
public class SubThread extends Thread{
    private String threadName;
    private int num=10;
    public SubThread(String threadName){
        this.threadName=threadName;
    }

    @Override
    public void run() {
        while(num>0){
            System.out.println(this.threadName+": "+num);
            num--;
        }
    }

}
