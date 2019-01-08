/*
    汽车和发动机之间的接口。
    生产汽车的厂家面向接口生产
    生产发动机的厂家面向接口生产
 */
public interface Engine {
    //所有的发动机都可以启动
    void start();
}
