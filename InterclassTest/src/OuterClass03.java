/*
    匿名内部类：指的是类没有名字。
 */
public class OuterClass03 {
    //静态方法
    public static void test(CustomerService cs){
        cs.logout();
    }
    //入口
    public static void main(String[] args){
        //调用t方法
        //test(new CustomerServiceImpl());

        //使用匿名内部类的方式执行test方法
        //整个这个“new CustomerService(){}”就是匿名内部类

        test(new CustomerService(){
            public void logout(){
                System.out.println("exit!");
            }
        });
        //匿名内部类的优点是少定义一个类
        //缺点：无法重复使用
    }


}
//接口
interface CustomerService{
    //退出系统
    void logout();

}
//编写一个类实现CustomerServe接口
/*
class CustomerServiceImpl implements CustomerService{
    public void logout(){
        System.out.println("系统已经安全退出！");
    }
}
*/