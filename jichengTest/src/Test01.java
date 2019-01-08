public class Test01 {
    public static void main(String[] args){
        //生产引擎
        YAMAHA e1 = new YAMAHA();
        //生产汽车
        Car C = new Car(e1);
        //测试引擎
        C.testEngine();

    }
}
