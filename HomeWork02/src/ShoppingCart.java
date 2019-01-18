import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//购物车
public class ShoppingCart {
    //使用Map来储存商品条目
    Map<Product,Integer> productMaps;
    //总价
    double totalPrice;
    //Constructor
    ShoppingCart(){
        productMaps = new HashMap<Product,Integer>();
    }
    //添加一个商品
    public void add(Product p){
        add(p,1);
    }
    //添加N个商品
    public void add(Product p,int n){
        //判断该购物车中是否含有该商品
        if(!productMaps.containsKey(p)){
            productMaps.put(p,n);//自动装箱
        }else{
            //车中有该商品
            int before = productMaps.get(p).intValue();//添加商品之前的该商品数量
            int after = before + n;
            productMaps.put(p,after);//key重复value覆盖
        }
        //修改总价
        totalPrice +=p.getPrice()*n;
    }
    //删除一个商品
    public void remove(Product p){
        remove(p,1);
    }
    //删除N个商品
    public void remove(Product p,int n) {
        //如果购物车中的某商品数量和n是相等的，必须删除整个条目
        int before = productMaps.get(p).intValue();
        if (before == n) {
            productMaps.remove(p);
        } else {
            int after = before - n;
            productMaps.put(p, after);
        }
        //修改总价
        totalPrice -= p.getPrice() * n;
    }
    //清空购物车
    public void clear(){
        productMaps.clear();
        totalPrice = 0.0;
    }
    //输出购物车详单
    /*
       格式:
       购物详单：
               10  苹果 10元
               3   西瓜  30元
               --------------
                       总价：40
     */
    public void print(){
            StringBuffer sb = new StringBuffer();
            sb.append("购物详单：\n");
            //遍历Map
            Set<Product> keys = productMaps.keySet();
            Iterator<Product> it = keys.iterator();
            while (it.hasNext()) {
                Product k = it.next();
                Integer v = productMaps.get(k);
                sb.append("/t" + v.intValue() + "\t" + k + "\t" + (v.intValue() * k.getPrice()) + "元\n");
            }
            sb.append("\t\t\t\t\t\t\t\t\t总价：" + totalPrice + "元");
            System.out.println(sb);
        }
}
