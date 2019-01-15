/*
        以下程序的缺点：频繁访问磁盘，伤害磁盘，并且效率低
 */

import java.io.FileInputStream;

public class FileInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        //创建流
        FileInputStream fis = new FileInputStream("D:\\first-git\\IOclass\\src\\read");
        //开始读
        /*
        while (true){
            int temp = fis.read();
            if(temp==-1) break;
            System.out.println(temp);

        }
        */
        //升级循环
        int temp = 0;
        while((temp = fis.read()) != -1){
            System.out.println(temp);
        }
        //关闭
        fis.close();
    }
}
