public class OOTest01 {
    public static void m1(int i){
        i++:
        System.out.println("m1-->"+i);
    }
    public static void main(String[] args){
      //  Student stu1 = new Student();
        Customer c = new Customer();
      /*  System.out.println(c.age);
        c.age = 10;
        System.out.println(c.age);
        stu1.id=100;
        stu1.name="张三";
        stu1.age=19;
        stu1.sex=false;
        stu1.adder="北京";
        System.out.println("id:" +stu1.id);
        System.out.println("name:" +stu1.name);
        System.out.println("age:"+stu1.age);
        System.out.println("sex:"+stu1.sex);
        System.out.println("addeess:"+stu1.adder);
        */
      c.setAge(-10);
      System.out.println(c.getAge());
    }
}


