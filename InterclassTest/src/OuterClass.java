/*
    关于静态内部类
        1.静态内部类可以等同看做静态变量
        内部类重要的作用：可以访问外部类中私有的数据。
        2.静态内部类可以直接访问外部类的静态数据，无法直接访问成员
 */
public class OuterClass {
    //静态变量
    private  static String s1 = "A";
    //成员变量
    private String s2 = "B";
    //静态方法
    private  static void m1(){
        System.out.println("static's m1 method execute");
    }
    //成员方法
    private void m2(){
        System.out.println("m2 method execute");
    }


    //静态内部类
    //可以用访问控制权限的修饰符修饰。
    //public,protected,private,缺省
    static class InnerClass{
        //定义静态方法
        public static  void m3(){
            System.out.println(s1);
            m1();
            //System.out.println(s2);s2访问不了
        }
        //成员方法
        public void m4(){
            System.out.println(s1);
            m1();
            //System.out.println(s2);s2访问不了
        }
    }
    //入口
    public static void main(String[] args){
        //执行m3
        OuterClass.InnerClass.m3();
        //执行m4
        InnerClass inner = new OuterClass.InnerClass();
        inner.m4();
    }
}
