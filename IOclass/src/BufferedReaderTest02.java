import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
   BufferReader
   InputStreamReader
 */

public class BufferedReaderTest02 {
    public static void main(String[] args) throws  Exception{
        //创建带有缓冲区的字符输入流
        FileInputStream fis = new FileInputStream("D:\\first-git\\IOclass\\src\\read");//文件字节输入流
        //转换流（将字节流转换成字符流）
        InputStreamReader isr = new InputStreamReader(fis);//isr是字符流
        BufferedReader br = new BufferedReader(isr);
        //开始读
        String temp = null;
        while((temp = br.readLine())!= null){
            System.out.println(temp);
        }
        //关闭，关闭最外层的流即可。（装饰者模式）
        br.close();
    }
}
