import java.util.Scanner;

public class Test01 {
    public static void main(String[] rags){
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎使用酒店管理系统，酒店房间列表如下所示：");
        //初始化酒店
        Hotel b = new Hotel();
        //输出房间列表
        b.print();
        System.out.print("请输入预定房间的编号：");
        String no = s.next();
        //预定房间
        b.order(no);
        //打印酒店列表
        b.print();
        System.out.print("请输入需退房间的编号：");
        String no1 = s.next();
        //退房
        b.exit(no1);
        //打印酒店列表
        b.print();

    }
}
