/*
    局部内部类等同于局部变量
    重点：局部内部类在访问局部变量的时候，局部变量必须使用final修饰
 */
public class OuterClass02 {
    //方法
    public void m1(){
        //局部变量
         int i = 10;
        //局部内部类
        //不能用访问控制权限修饰符修饰。
        class Innerclass{
            //内部类不能有静态声明
            //public static void m1(){}
            //成员方法
            public void m2(){
                System.out.println(i);
            }
        }
        //调用m2
        Innerclass Inner = new Innerclass();
        Inner.m2();
    }
    //入口
    public static void main(String[] args){
        OuterClass02 oc = new OuterClass02();
        oc.m1();
    }
}
