import java.util.Scanner;

/*
        如何接收用户键盘的输入数距
 */
public class KeyInput {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        //程序执行到此，停下来，等待用户的输入
        String userInput = s.next();
        System.out.println("你输入了，"+ userInput);
    }

}
