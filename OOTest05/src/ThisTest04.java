/*
     this不能用在静态方法中。
       1.静态方法的执行根本不需要java对象的存在，直接使用类名.的方式访问。
       而this代表的是当前对象，所以静态方法中根本没有this
 */
public class ThisTest04 {
    String str;
    //入口
    public static void main(String[] args){
        Person.m1();
        //str是一个成员变量，必须由引用.访问
        //System.out.println(str);

    }
}
class Person{
    String name;
    Person(){};
    Person(String name){
        this.name= name;
    }
    //静态方法
    public static void m1(){
        //System.out.println(this.name);
        //如果想要访问name只能：
        Person p1 = new Person("wangmin");
        System.out.println(p1.name);
    }
}
