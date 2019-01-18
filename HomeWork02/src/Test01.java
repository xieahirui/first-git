
public class Test01 {
    public static void main(String[] args){
        //创建购物车
        ShoppingCart cart = new ShoppingCart();
        //货物
        Product p1 = new Product(1000,"iphone4s",100.0);
        Product p2 = new Product(1001,"小米",1000.0);
        Product p3 = new Product(1002,"华为",10000.0);
        Product p4 = new Product(1003,"iphonex",10001.0);
        //开始购物
        cart.add(p1);
        cart.add(p2);
        cart.add(p3);
        cart.add(p4);
        //打印详单
        cart.print();
    }

}
