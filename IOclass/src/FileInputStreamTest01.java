import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.InputStream;文件字节输入流
    按照字节方式读取文件。
 */
public class FileInputStreamTest01 {
    public static void main(String[] args){
        FileInputStream  fis = null;
        try{
            //1.要读取某文件，先于这个文件创建一个“输入流”
            //文件路径
            String filePath = "D:\\first-git\\IOclass\\src\\read";//相对路径，相对当前而言，在当前路径下找
            fis = new FileInputStream(filePath);
            //2.开始读
            int  i1 = fis.read();//以字节的方式读取
            int i2 = fis.read();
            int i3 = fis.read();
            int i4 = fis.read();
            int i5 = fis.read();
            int i6 = fis.read();
            int i7 = fis.read();



            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            System.out.println(i6);
            System.out.println(i7);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //为了保证流一定会释放，所以在finally语句块中执行
            if(fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
