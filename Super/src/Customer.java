/*
    Customer 没有显示继承其他类，默认继承SUN提供的java.lang.Object;
    所有Customer类中也有toString方法。
 */
public class Customer {
    public  static void main(String[] args){
        Customer c = new Customer();
        String s = c.toString();

        System.out.println(s);//Customer@defend
    }
}
