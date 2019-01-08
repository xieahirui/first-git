/*
    编写接口实现类
    该类的编写完全面向接口去实现的。
 */
public class CustomerServiceImpl implements CustomerService{
    //对接口中抽象的方法进行实现。
    public void logout(){
        System.out.println("成功退出系统！");
    }
}
