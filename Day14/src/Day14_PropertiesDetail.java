public class Day14_PropertiesDetail  {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("\n当前这个人的信息");
        System.out.println("age=" + p1.age + "\nname=" + p1.name + "\nsal=" + p1.sal + "\nisPass=" + p1.isPass);
        p1.name = "小明";
        p1.age = 17;
        p1.sal = 3000.1;
        p1.isPass = true;
        //把p1的地址赋值给p2，两个对象共享同一个地址，修改哪一个都会导致成员变量的共同变化
        Person p2 = p1;
        System.out.println("age=" + p2.age + "\nname=" + p2.name + "\nsal=" + p2.sal + "\nisPass=" + p2.isPass);
        //修改p1的年龄，发现p2也变化
        p1.age = 18;
        System.out.println("p1_age=" + p1.age);
        System.out.println("p2_age=" + p2.age);
        //修改p2的姓名，发现p1也变化
        p2.name = "小张";
        System.out.println("p2_name=" + p2.name);
        System.out.println("p1_name=" + p1.name);
    }
}
class Person {
    String name;//属性、成员变量、字段、field
    int age;
    double sal;
    boolean isPass;
    //属性可以是基本数据类型，也可以是引用类型(对象,数组)
}