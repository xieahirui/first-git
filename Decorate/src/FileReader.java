/*
        对FileReader这个类的close方法进行扩展
        1。继承（不推荐，代码耦合度太高，不利于项目的扩展，
        2.装饰者模式
 */

public class FileReader extends  Reader{
    public void close(){
        System.out.println("FileReader closed!");

    }
}
