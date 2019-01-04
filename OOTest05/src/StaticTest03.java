/*
    static修饰的方法叫做静态方法
        一般情况下工具类中的方法大部分都是静态方法
        静态方法不用创建对象也能直接访问该方法。
 */
public class StaticTest03 {
    //成员方法
    //成员方法必须使用“引用.”调用。
    public void m1(){

    }
    //静态方法
    //可以使用“类名.”方式调用,也可以使用“引用.”。即使用的是“引用.”,底层用的还是“类名.”
    //静态方法中不能直接访问非静态数据
    //静态方法中不能使用this
    public static void m2(){
        System.out.println("ma....");
    }
    //入口
    public static void main(String[] args){
        StaticTest03 st = new StaticTest03();
        st.m1();
        m2();
        //静态的方法按照正规的方式访问；“类名.”
        //静态的方法也能用“引用.”访问
        st.m2();//编译阶段检查出st是StaticTest03类型，编译通过，运行的时候，仍然使用“StaticTest03.”的方式访问。
                //该方法的执行不需要对象
        //空的引用去访问成员变量的时候会出现空指针异常。
        //m2方法不是“成员”而是静态的。
        //所以即使引用是空的，也不会报空指针异常。
        StaticTest03 s = null;
        s.m2();
    }
}
