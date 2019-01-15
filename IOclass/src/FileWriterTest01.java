import java.io.FileOutputStream;
import java.io.FileWriter;

/*
        java.io.Writer;
            java.io.OutputStreamWriter;转换流（字节输出流--》字符输出流）
                java.io.FileWriter;文件字符输出流
 */
public class FileWriterTest01 {
    public static void main(String[] args) throws Exception{
        //创建文件字符输出流
        //FileWriter fw = new FileWriter("D:\first-git\IOclass\src\read");//覆盖
        FileWriter fw = new FileWriter("D:\\first-git\\IOclass\\src\\read",true);//追加
        //开始写
        fw.write("wangmin momoda ");

        //将char数组的一部分写入
        char[] chars = {'我','是','中','国','人'};
        fw.write(chars,0,5);
        //刷新
        fw.flush();
        //关闭
        fw.close();
    }
}
