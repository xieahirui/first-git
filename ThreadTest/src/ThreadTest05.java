/*
    1.Thread.sleep(毫秒)
    2.sleep方法是一个静态的方法
    3.该方法的作用：阻塞当前线程，腾出CPU，让给其他线程
 */
public class ThreadTest05 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Processor3();
        t1.setName("t1");
        t1.start();
        //阻塞主线程
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            Thread.sleep(500);
        }
    }
}
class Processor3 extends  Thread{
    //Thread中的run方法不抛出异常，所以重写run方法之后，在run方法的声明位置上不能使用throws
    //所以run方法中只能是try 。。catch
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+1);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}