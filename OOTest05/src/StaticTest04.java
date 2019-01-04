/*
    static修饰的变量叫“静态变量”
        变量分类：
            1.局部变量
            2.成员变量（实例变量，非静态变量）
            3.静态变量（方法区）
          成员变量：创建JAVA对象的时候初始化。
          静态变量：在类加载阶段赋值，并且只赋值一次。
    类{
    成员变量
    成员方法

    静态变量
    静态方法

    静态语句块

    实例语句块
    构造方法

    this
    }
 */
public class StaticTest04 {
    public static  void main(String[] args){
        Animal1 a1 = new Animal1("AAA",10);
        Animal1 a2 = new Animal1("BBB",10);
    }
}
//抽象现实世界中的“陆生”动物
class Animal1{
    //Field
    //成员变量（一个对象一份）
    //成员变量再创建对象的时候初始化，并且储存在堆中的每一个对象中
    String name;
    int age;
    //String type = "陆生"；
    static String type = "陆生";//静态变量被存储在java的方法区，所有java共享这一变量
    //静态变量是类级别的，使用“类名.”的方式访问

    //Constructor
    Animal1(String name,int age){
        this.name = name;
        this.age = age;
    }
}
