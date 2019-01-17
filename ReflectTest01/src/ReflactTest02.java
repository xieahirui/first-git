import java.text.SimpleDateFormat;
import java.util.Date;

/*
    获取Class类型的对象之后，可以创建该类的对象
 */
public class ReflactTest02 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Employee");
        //创建此Class对象所表示的类的一个新的实例
        Object o = c.newInstance();//调用了Employee的无参构造方法
        System.out.println(c);
        Class c1=Class.forName("java.util.Date");
        Object o1 = c1.newInstance();
        if (o1 instanceof Date){
            Date t =(Date)o1;
            System.out.println(new SimpleDateFormat("yyyy-MM--dd HH:mm:ss SSS").format(t));
        }
    }
}
