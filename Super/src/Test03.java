public class Test03 {
    public static void main(String[] args){
        //创建信用卡对象
        DebitAccount da = new DebitAccount();
        //给信用卡账号赋值
        da.setActno("001");//赋值
        //可以间接访问
        System.out.println(da.getActno());//读数
        //没办法直接访问
        //System.out.println(da.actno);
    }
}
