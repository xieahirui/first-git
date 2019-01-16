/*
   java中实现线程的第二种方法：
          第一步：写一个类实现java.lang.Runable;接口
          第二步：实现run方法
 */
public class ThreadTest02 {
    public static void main(String[] args){
        //创建线程
        Thread t = new Thread(new Processor());
        //启动
        t.start();
    }
}
//这种方式是推荐的，因为一个类实现接口之外保留了类的继承
class Processor implements Runnable{
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println("run-->"+ i);
        }
    }
}

