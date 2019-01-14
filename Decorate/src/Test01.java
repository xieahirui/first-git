public class Test01 {
    public static void main(String[] args){
        /*
        //创建被装饰者
        FileReader fr = new FileReader();
        //创建装饰者
        bufferedReader br = new bufferedReader(fr);
        */
        bufferedReader br =new bufferedReader(new FileReader());
        //通过执行装饰者中的方法间接去执行被装饰者中的方法。
        br.close();
    }
}
