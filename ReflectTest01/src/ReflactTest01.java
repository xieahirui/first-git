import java.util.Date;

/*
    获取Class类型对象的三种方法
 */
public class ReflactTest01 {
    public static void main(String[] args) throws Exception{
        //第一种方式
        Class c1 = Class.forName("Employee");//c1用来保存内存地址指向堆中的对象，该对象代表的是Employee整个类。
        //第二种方式：
        //java中每个类型都有class属性。
        Class c2 = Employee.class;
        //第三种方式：
        //java语言中任何一个java对象都是getClass方法；
        Employee e = new Employee();
        Class c3 = e.getClass();//c3是运行时类是Emplyoyye
        System.out.println(c1 == c2);
        System.out.println(c2==c3);
        Class c4 = Date.class;//c4代表Date这个类
        Class c5 = Class.forName("java.util.Date");//必须写类的全名，类全名带有包名。
        Date d = new Date();
        Class c6 = d.getClass();

    }
}
