/*
    关于成员内部类
        1.成员内部类可以等同看做成员变量

        2.成员内部类不能有静态声明
        3.成员内部类可以访问外部所有的数据
 */
public class OuterClass01 {
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


    //成员内部类
    //可以用访问控制权限的修饰符修饰。
    //public,protected,private,缺省
     class InnerClass{
        //定义静态方法
       // public static  void m3(){ }
        //成员方法
        public void m4(){
            System.out.println(s1);
            m1();
            System.out.println(s2);
            m2();
            //System.out.println(s2);s2访问不了
        }
    }
    //入口
    public  static void main(String[] args){
        //创建外部类对象
        OuterClass01 oc = new OuterClass01();
        InnerClass inner = oc.new InnerClass();
        inner.m4();
    }
}
