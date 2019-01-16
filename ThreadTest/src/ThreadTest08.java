/*
        Thread.yield();
        1.这个方法是一个静态方法
        2.作用：给同一个优先级的线程让位，但是让为时间不固定。
        3.和sleep方法相同，就是yield时间不固定。
 */
public class ThreadTest08 {
    public static void main(String[] args){
        Thread t = new Processor6();
        t.setName("t");
        t.start();
        //主线程中
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
class Processor6 extends Thread{
    public void run(){
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            if(i%20==0){
                Thread.yield();
            }
       }
    }
}
