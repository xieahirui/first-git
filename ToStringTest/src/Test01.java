/*
    关于Object中的toString方法：v
       SUN在Object类中的设计toString方法的目的，返回java对象的字符串表示形式。
       在现实的开发过程中，Object里面的toString方法已经不够用了。
       object中的toString方法就是要被重写的。
 */
public class Test01 {
    public static void main(String[] args){
        //创建一个Object类型的对象。
        Object o1 = new Object();
        //调用toString方法。
        String oStr = o1.toString();
        String oStr2 = o1.toString();
        System.out.println(oStr);
        //创建一个Person类型的对象
        Person p1  = new Person("王敏",24);
        //调用toString方法
        String pStr  = p1.toString();
        System.out.println(pStr);

        Person p2  = new Person("谢海睿",23);
        //调用toString方法
        String pStr2  = p2.toString();
        System.out.println(pStr2);


    }
}
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //重写toString方法
    //根据项目的需求而定。
    //需求规定，显示格式： Person【name=王敏，age = 24】
    public String toString (){
        return "Person[name="+name+",age="+age+" ]";
    }
}
