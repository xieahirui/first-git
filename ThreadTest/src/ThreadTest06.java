/*
  线程的休眠
 */
public class ThreadTest06 {
    public static void main(String[] args) throws Exception{
        //需求：启动线程，5S之后打断线程的休眠
        Thread t = new Thread(new Processor4());
        //起名
        t.setName("t");
        //启动
        t.start();
        //5秒之后
        Thread.sleep(500);
        //打断休眠
        t.interrupt();
    }
}
class Processor4 implements Runnable{
    public void run(){
        try{
            Thread.sleep(1000000L);
        }catch(InterruptedException e){
            //e.printStackTrace();
        }
        for(int i =0; i <10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
