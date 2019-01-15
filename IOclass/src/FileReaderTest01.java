
import java.io.FileReader;

/*
        java.io.Reader
            java.io.InputStreamReader;转换流（字节输入流--》字符输入流）
                java.io.FileReader；文件字符输入流
 */
public class FileReaderTest01 {
    public static void main(String[] args){
        FileReader fr = null;
        try{
            //创建文件字符输入流
           fr = new FileReader("D:\\first-git\\IOclass\\src\\read");
            //开始读
            char[] chars = new char[512];//1KB
            int temp = 0;
            while ((temp = fr.read(chars)) != -1){
                //char数组有效部分转换成字符串
                System.out.print(new String(chars,0,temp));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try{
                    fr.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
