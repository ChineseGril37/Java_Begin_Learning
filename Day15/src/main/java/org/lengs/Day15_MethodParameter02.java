public class Day15_MethodParameter02 {
    public static void main(String[] args){
        A a = new A();
        a.age = 10;
        B b = new B();
        System.out.println("B类中置空前\na.age = " + a.age);
        b.clear(a);
        System.out.println("B类中置空后\na.age = " + a.age);
        System.out.println("B类中重置前\na.age = " + a.age);
        b.reset(a);
        System.out.println("B类中重置后\na.age = " + a.age);
    }
}
class A{
    String name;
    int age;
}
class B{
    public void clear(A a){
        a = null;
    }
    public void reset(A a){
        a = new A();
        a.age = 18;
        a.name = "???";
    }
}
