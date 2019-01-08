/*
    客户业务接口
    接口的作用：
        1.可以使项目分层，所有层都面向接口开发，开发效率提高了。
        2.接口使得代码与代码之间的耦合度降低，就象内存条和主板的关系，变得“可插拔”。
        接口和抽象类都能完成某个功能，优先选择接口。
        因为接口可以多实现，多继承。
        并且一个类除了实现接口之外，还可以继承其他类（保留了类的继承）
 */
public interface CustomerService {
    //定义一个退出系统的方法
    void logout();
}