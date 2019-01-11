public class Test {
    public static void main(String[] args){
        Stack s = new Stack();
        User u1 = new User("jack",20);
        User u2 = new User("jack",22);
        User u3 = new User("jack",23);
        User u4 = new User("jack",24);
        User u5 = new User("jack",25);
        try{
            s.push(u1);
            s.push(u2);
            s.push(u3);
            s.push(u4);
            s.push(u5);
        }catch(StackOperationException e){
            e.printStackTrace();
        }
        try{
            //弹
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        }catch(StackOperationException e){
            e.printStackTrace();
        }
    }
}
class User{
    String name;
    int age;
    User(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "User[name="+name+",age="+age+"]";
    }
}
