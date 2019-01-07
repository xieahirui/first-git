/*
    引入继承最基本的作用是代码的重用
    语法：
        【修饰符列表】 class 子类名 extends 父类名{
        类体
        }
        java中只支持单继承
        一个类如果没有显示继承其它类，则该类默认继承Object。
        Object是sun写的一个根类

 */

public class Sub extends Super {
    public  void m3(){
        System.out.println("m3....");
    }
}
class A{}
