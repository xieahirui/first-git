import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
        BufferedWriter
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //创建带有缓冲区的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\first-git\\IOclass\\src\\read"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\first-git\\IOclass\\src\\read",true)));
        //开始写
        bw.write("德玛西亚");
        //写入一个行分隔符
        bw.newLine();
        bw.write("人头狗");
        //刷新
        bw.flush();
        //关闭
        bw.close();
    }
}
