public class OOTest05 {
    public static void m1(Animal a){
        a.age++;
        System.out.println("m-->"+ a.age);
    }
    public static void main(String[] args){
        Animal a = new Animal(10);
        m1(a);
        System.out.println("main-->"+ a.age);
    }
}
class Animal{
    int age;
    //Constructor
    Animal(int _age){
        age =  _age;
    }
}