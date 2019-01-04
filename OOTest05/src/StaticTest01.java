/*
    static关键字：
        1.static修饰变量叫做“静态变量”。
        2.static修饰的方法叫做“静态方法”。
        3.static定义静态语句块。
        以下例子演示：static定义静态语句块
        static定义的静态语句块在类加载阶段执行，并且只执行一次
        并且自上而下的执行。
 */
public class StaticTest01 {
    //静态语句块
    static {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    public static void main(String[] args){
        System.out.println("main execute");
        System.out.println("main execute");
    }
}
