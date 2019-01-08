public class Test {
    //入口
    public static void main(String[] args){
        //要执行CustomerServiceImpl中的logout方法
        //以下程序面向接口调用
        CustomerService cs = new CustomerServiceImpl();//多态
        cs.logout();
    }

}
