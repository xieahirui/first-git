/*
        如何正确的更好的终止一个正在执行的线程
        需求，线程启动5s之后终止
 */
public class ThreadTest07 {
    public static  void main(String[] args) throws Exception{
        Processor5 p = new Processor5();
        Thread t = new Thread();
        t.setName("t");
        t.start();
        //5秒后终止
        Thread.sleep(5000);
        //终止
        p.run = false;
    }
}
class Processor5 implements Runnable{
    boolean run = true;
    public void run(){
        for(int i = 0;i<10;i++){
            if(run){
                try{Thread.sleep(1000);}catch(Exception e){

                }
            }else{
                return;
            }
        }
    }
}
