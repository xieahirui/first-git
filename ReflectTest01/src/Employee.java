public class Employee {
    //Field
    private  String name;
    //Constructor
    public  Employee(){
        System.out.println("Employee使用无参构造方法");
    }
    public Employee(String name){
        this.name = name;
    }
    //方法
    public void work(){
        System.out.println(name+"在工作！");
    }



}
