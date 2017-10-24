package com.qigang.thread;

/**
 * 通过实现Runnable接口来实现线程可执行的方法
 */
public class RunnableImpl implements Runnable{
    private int num=10;
    @Override
    public void run() {
        while(num>0){
            System.out.println(Thread.currentThread().getName()+": "+num);
            num--;
        }
    }

}
