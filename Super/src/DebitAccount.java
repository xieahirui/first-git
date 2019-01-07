/*
        信用账户
        子类，派生类，subclass
        java语言中子类继承父类，会将父类中所有的数据全部继承，包括私有的也能继承过来。
        但是在子类中无法直接访问父类中的私有的数据。但是可以间接访问
        构造方法无法被继承。
 */
public class DebitAccount extends Account {
    //信誉度
    double debit;

}
