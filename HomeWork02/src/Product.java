//超市中的商品
public class Product {
    //Filed
    private int no;
    private String name;
    private double price;
    //Constructor
    public Product(){}
    public Product(int no,String name,double price){
        this.no = no;
        this.name = name;
        this.price = price;
    }
    //setter and getter
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        return;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    //toString
    public String toString(){
        return "Product[编号：]"+no+"名称："+name+",单价："+price+"元/个]";
    }
    //hashCode
    //超市商品编号的格式【10000-99999】
    public int hashCode(){
        return no/1000;
    }
    //equals
    //需求：如果商品编号和商品的名字都一样表示同一个商品
    public boolean equals(Object o){
        if (this==o) return true;
        if (o instanceof Product){
            Product p = (Product)o;
            if (p.no==this.no&&p.name.equals(this.name)){
                return true;
            }
        }
        return false;
    }


}
