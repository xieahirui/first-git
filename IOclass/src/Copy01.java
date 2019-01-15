import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
        文件的复制粘贴
 */
public class Copy01 {
    public static void main(String[] args) throws Exception{
        //创建输入流
        FileInputStream fis = new FileInputStream("D:\\first-git\\IOclass\\src\\read");
        //创建输出流
        FileOutputStream fos = new FileOutputStream("D:\\first-git\\IOclass\\src\\read1");
        //边读边写
        byte[] bytes = new byte[1024];//1KB
        int temp = 0;
        while((temp = fis.read(bytes)) != -1){
            //将byte数组中的内容直接写入
            fos.write(bytes,0,temp);
        }
        //刷新
        fos.flush();
        //关闭
        fis.close();
        fos.close();
    }
}
