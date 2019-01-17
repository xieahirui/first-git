import java.util.Date;

/*
    关于java中的可变长参数
 */
public class Test01 {
    //m1方法有一个int类型可变长参数
    public static void m1(int...a){
        System.out.println("Test");
    }
    //如果可以精确匹配的方法，则调用该方法，不会再去执行可变长参数的那个方法
    public static void m1(int i){
        System.out.println(i);
    }
    //可变长参数可以等同看做数组

    public static void m2(String...args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void m3(Class...args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
   // public static void m4(String...a,int i){}//可变长参数只能出现一次，并且在最后一位出现
    public static void main(String[] args){
        m1();
        m1(1);
        m1(1,2);
        m1(3,4,5,6,7);

        m2("体育","音乐","旅游","美食");
        m3(Date.class,Employee.class);
    }

}
