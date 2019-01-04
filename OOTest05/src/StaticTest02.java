/*
    关于实例语句块
 */
public class StaticTest02 {
    //静态语句块
    static{
        System.out.println("A");
    }
    //实例语句块
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
    //构造方法
    StaticTest02(){
        System.out.println("StaticTest02无参数的构造执行");
    }
    //入口
    public static void main(String[] args){
        //调用构造方法
        new StaticTest02();
        new StaticTest02();
        new StaticTest02();

    }
}
