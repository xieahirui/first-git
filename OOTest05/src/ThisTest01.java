/*
     this 的使用方法：
     1. this是什么？
        this是一个引用类型，
        在堆中的每一个java对象上都有this，
        this保存内存地址指向自身。
     2.this能用在哪些地方？
        第一：this可以用在成员方法中。
        第二：this可以用在构造方法中。
            语法：this（实参）
            通过一个构造方法去调用另一个构造方法。
            目的：代码重用
            this(实参)必须出现在构造方法的第一行。
 */
public class ThisTest01 {
    public static void main(String [] args){
        MyDate t1 = new  MyDate(2008,8,8);
        System.out.println(t1.year + "年" + t1.month + "月" + t1.day + "日");
        //创建对象
        MyDate t2 = new MyDate(2012,12,20);
        System.out.println(t2.year + "年" + t2.month + "月" + t2.day + "日");

    }
}
class MyDate{
    int year;
    int month;
    int day;
    //Constructor
    //需求：在创建日期对象的时候，默认的日期是：1970.1.1
    MyDate(){
        this(1970,1,1);
        /*this.year = 1970;
        this.month = 1;
        this.day = 1;
        */

    }
    MyDate(int _year,int _month,int _day){
        year = _year;
        month  = _month;
        day = _day;
    }
}
