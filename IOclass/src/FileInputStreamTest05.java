import java.io.FileInputStream;

public class FileInputStreamTest05 {
    public static void main(String[] args) throws Exception{
        //创建流
        FileInputStream fis = new FileInputStream("D:\\first-git\\IOclass\\src\\read");
        System.out.println(fis.available());
        System.out.println(fis.read());
        //int available();返回流中剩余的估计字节数
        System.out.println(fis.available());
        //跳过2个字节
        fis.skip(2);
        System.out.println(fis.read());
        //关闭
        fis.close();
    }

}
