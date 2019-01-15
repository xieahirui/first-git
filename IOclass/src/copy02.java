import java.io.FileReader;
import java.io.FileWriter;

/*
        文件复制
        只能复制纯文本文件
 */
public class copy02 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("D:\\first-git\\IOclass\\src\\copy02.java");
        FileWriter fw = new FileWriter("D:\\first-git\\IOclass\\src\\copy03.java");
        char[] chars = new char[512];
        int temp = 0;
        while((temp=fr.read(chars)) != -1){
            //写
            fw.write(chars,0,temp);
        }
        fw.flush();
        fr.close();
        fw.close();
    }
}
