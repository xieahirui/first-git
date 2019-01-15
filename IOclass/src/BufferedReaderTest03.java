import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
  接受用户键盘输入
 */
public class BufferedReaderTest03 {
    public static void main(String[] args) throws  Exception{
        /*
        //以前的方式
        Scanner s = new Scanner(System.in);//System.in是一个标准的输入流，默认接受键盘的输入。以空格为结束符号
        //程序执行到此处停下，等待用户输入
        String str = s.next();
        System.out.println("您输入了："+str);
        */
        //使用Bufferedreader用来接受用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //接受输入（每一次接受一行）
        String str = br.readLine();
        System.out.println("您输入了："+str);
        br.close();
    }
}
