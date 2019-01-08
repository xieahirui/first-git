/*
    关于Object中的finalize方法
    finalize 方法什么时候调用？jcvn
    1.finalize方法每个java对象都有
    2.finalize方法不需要程序员去调用，由系统自动调用
    3.java对象如果没有更多的引用指向它，则该java对象成为垃圾数据，等待垃圾回收器的回收，垃圾回收器在回收这个
    java对象之前会自动调用该对象的finalize方法。
    finalize方法是该对象马上就要被回收了，例如：需要释放资源，则可以在该方法中释放
 */
public class finalizeTest {
    public static void main(String[] args){
        Person1 p1 = new Person1();
        p1 = null;//没有引用在指向他。等待回收
        //程序员只能“建议”垃圾回收机制回收垃圾。
        System.gc();
    }
}
class Person1{
    //重写Object中的finalize方法
    public void finalize() throws  Throwable{
        System.out.println(this + "马上就要被回收了！");
    }
}
