//生产汽车
public class Car {
        //Field
        //引擎
        //面向接口编程
        Engine e;
        //Constructor
        Car(Engine e){
            this.e = e;
        }
        //汽车应该能够测试引擎
        public void testEngine(){
            e.start();
        }



}
