import java.io.FileInputStream;
import java.util.Properties;

/*
   IO+Properties
   dbinfo这样的文件我们称作配置文件，
   配置文件的作用就是：使程序更加灵活
   注意：一般在程序中可变的东西不要写死，推荐写道配置文件中，运行同样的程序得到不同的结果
   想dbinfo这样一个具有特殊内容的配置文件我们又叫做：属性文件。
   java规范中要求属性文件以“.properties”
   属性文件中的数据要求：
      key和value之间可以使用“空格”，“冒号”，“等号”。
      如果“空格”，“等号”，“冒号”都有，按最前面的作为分隔符
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        //创建属性对象
        Properties p = new Properties();//和Map一样，只不过key和value只能存储字符串类型
                                        //key不能重复，如果可以重复则value覆盖
        //创建输入流
        FileInputStream fis = new FileInputStream("D:\\first-git\\ReflectTest01\\src\\dbinfe");
        //将fis流中的所有数据加载到属性对象中
        p.load(fis);//讲现在属性对象中有（key=username,value=scott）
        //关闭流
        //通过key获取value
        String v1 = p.getProperty("driver");
        String v2 = p.getProperty("url");
        String v3 = p.getProperty("username");
        String v4 = p.getProperty("password");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

    }
}
