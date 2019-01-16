/*
        三个方法：
            1。获取当前线程对象Thread.currentThread
            2.给线程起名 t.setName("t1");
            3.获取线程的名字 t.getName();
 */
public class ThreadTest03 {
    public static void main(String [] args){
        //如何获取当前线程对象？
        Thread t = Thread.currentThread();//t保存的内存地址指向的线程是“主线程对象”
        //获取线程的名字
        System.out.println(t.getName());//main

        Thread t1 =  new Thread(new Processor1());
        //给线程起名
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(new Processor1());
        //给线程起名
        t2.setName("t2");
        t2.start();
    }
}
class Processor1 implements Runnable{
    public void run(){
        Thread t = Thread.currentThread();//t保存的内存地址指向的线程是“t1线程对象”
        System.out.println(t.getName());
    }
}
