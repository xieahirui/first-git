/*
    关于Object中的equals方法c
    Object 中的equals方法：
       public boolean equals(o2){
          return (o1 == o2);
       }
       o1.equals(o2);o1是this，o2是obj
       == 两边如果是引用类型，则比较内存地址，地址相同则是ture,反之则false。

       Object 中的equals方法比较的是引用的内存地址。
       java对象中的equals方法的设计目的，判断两个对象是否一样
 */
public class EqualsTest {
    public static void main(String[] args){
        Object o1 = new Object();
        Object o2 = new Object();
        boolean b1 = o1.equals(o2);
        System.out.println(b1);
        Star s1 = new Star(100,"谢海睿");
        Star s2 = new Star(100,"谢海睿");

        System.out.println(s1.equals(s2));
    }
}
class Star{
    //身份证
    int id;
    //姓名
    String name ;
    //Constructor
    public Star(int id ,String name){
        this.id = id;
        this.name = name;
    }
    //Object中的equals方法比较的是内存地址
    //在现实的业务逻辑中，不应该比较内存地址，应该比较内容。
    //所以Object中的equals方法也要重写。
    //需求规定：如果身份证号一致。并且名字也一致，则代表是同一个人
    //s1.equals(s2)
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Star) {
            Star s = (Star) obj;
            if (s.id == id && s.name.equals(name))
                return true;
        }
        return false;
    }
}
