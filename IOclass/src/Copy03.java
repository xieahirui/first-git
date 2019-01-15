import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
        使用BufferedReaderheBufferedWriter完成复制
 */
public class Copy03 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("D:\\first-git\\IOclass\\src\\read"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\first-git\\IOclass\\src\\read1"));

        String temp = null;
        while((temp = br.readLine())!= null){
            bw.write(temp);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
