/*
   账户类
      父类，超类，积累，superclass
 */
public class Account {
    //账号
    private String actno;
    //余额
    double balance;
    //Constructor
    Account(){}
    Account(String actno,double balance){
        this.actno = actno;
        this.balance=balance;
    }
    //setter and getter
    public void setActno(String actno){
        this.actno = actno;
    }
    public String getActno(){
        return actno;
    }
}
