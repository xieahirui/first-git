/*
    线程的合并
 */
public class ThreadTest09 {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new Processor7());
        t.setName("t");
        t.start();
        //合并线程
        t.join();//t和主线程合并
        //主线程
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
class Processor7 implements Runnable{
    public void run(){
        for (int i = 0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}