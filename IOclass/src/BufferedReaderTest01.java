import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;

/*
        字节
        BufferedInputStream
        BufferedOutputStream
        字符
        BufferedReader;  带有缓冲区的字符输入流
        BufferedWriter;  带有缓冲区的字符输出流
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{

        //创建一个带有缓冲区的字符输入流
        /*
        FileReader fr = new FileReader("D:\\first-git\\IOclass\\src\\BufferedReaderTest01.java");//创建一个文件字符输入流
        BufferedReader br = new BufferedReader(fr);//将文件字符输入流包装成带有缓冲区的字符输入
        */
        //根据流出现的位置，流可以分为：包装流或者处理流和节点流
        //FileReader fr 是一个节点流
        //BufferedReader br 是一个包装流，或者处理流
        BufferedReader br = new BufferedReader(new FileReader("D:\\first-git\\IOclass\\src\\BufferedReaderTest01.java"));
        //开始读
        String temp = null;
        while((temp = br.readLine()) != null){//br.readLine()方法读取一行，但是行位不带换行符。
            System.out.println(temp);//输出一行
        }
        //关闭
        //注意：关闭的时候只需要关闭最外层的包装流。（这里有一个装饰者模式）
        br.close();
    }
}
