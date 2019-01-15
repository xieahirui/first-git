
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  java.io.PrintStream;标准的输出流，默认打印到控制台，以字节的方式
  java.io.PrintWriter ;以字符的方式
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception{
        //默认是输出到控制台的
        System.out.println("Hello world!");
        PrintStream ps = System.out;
        ps.println("java......");
        //可以改变输出方向
        System.setOut(new PrintStream(new FileOutputStream("D:\\first-git\\IOclass\\src\\log")));
        //再次输出
        System.out.print("haha");
        //通常使用上述的方式记录日志
        //需求：记录日志，m1方法开始执行的时间的结束的时间，记录到log文件中。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("m1方法开始执行的时间"+sdf.format(new Date()));
        m1();
        System.out.println("m1方法执行结束"+sdf.format(new Date()));

    }
    public static void m1(){
        System.out.println("m1 method execute!");
    }

}
