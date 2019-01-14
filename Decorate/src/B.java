public class B extends A{
    //重写方法，注意；在原代码的基础之上扩展，
    public void m1(){
        System.out.println("m1方法执行");
        super.m1();
        System.out.println("m2方法执行");

    }
}
