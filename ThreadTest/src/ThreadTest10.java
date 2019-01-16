/*
        异步编程模型：t1线程执行t1的,t2线程执行t2的，两个线程之间谁也不等谁
        同步编程模型：t1线程和t2线程执行，当t1线程必须等t2线程执行结束后，t1线程才能执行，这是同步编程模型。
        什么时候要同步呢？为什么要引入线程同步呢？
            1.为了数据的安全。尽管应用程序的使用率降低，但是为了保证数据是安全的，必须加入线程同步机制
            线程同步机制相当于使程序变成了（等同）单线程。
            2. 什么条件下使用线程同步？
                第一：必须是多线程环境
                第二；多线程环境共享同一个数据
                第三：共享的数据涉及到修改操作



 */
public class ThreadTest10 {
    public static void main(String[] args){
        //创建一个公共的账户
        Account act = new Account("actno-001",5000.0);
        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor8(act));
        Thread t2 = new Thread(new Processor8(act));

        t1.start();
        t2.start();
    }
}
//取款线程
class Processor8 implements Runnable{
    //账户
    Account act;
    //Constructor
    Processor8(Account act){
        this.act = act;
    }
    public void run(){
        act.withdraw(1000.0);
        System.out.println("取款1000.0成功，查看余额" + act.getBalance());
    }

}
//账户
class Account{
    private String actno;
    private double balance;

    public Account(){}
    public Account(String actno,double balance){
        this.actno=actno;
        this.balance=balance;
    }
    //setter and getter
    public void setActno(String actno){
        this.actno = actno;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getActno(){
        return actno;
    }
    public double getBalance(){
        return balance;
    }
    //对外提供一种取款的方式
    public void withdraw(double money) {//对当前账户进行取款操作
        synchronized(this){//加锁
            double after = balance - money;
            //延时
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            //更新
            this.setBalance(after);
        }

    }
}
