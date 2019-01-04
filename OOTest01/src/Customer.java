//定义一个公开的顾客类型
/*
   面向对象的封装性指的是：
      1.属性私有化：
      2.外部提供公开的set和get方法

      set和get方法的命名应该遵循规范
 */
public class Customer {
    //private int age;//只能在本类中访问
   private int age;
   //对外提供两个公开的方法：set（赋值）和get方法
   public void setAge(int _age){
       if(_age<0 || _age>100){
           System.out.println("年龄不合法");
           return;
       }

       age = _age;
   }

    public int getAge(){//成员方法，实例方法，非静态方法
                        //成员方法必须使用“引用.”的方法访问
        return age;
    }
}
