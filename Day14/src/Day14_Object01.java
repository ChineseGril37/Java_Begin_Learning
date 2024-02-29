public class Day14_Object01 {
    public static void main(String[] args) {
        //reset 我写的什么玩意儿
        //使用面向过程的方式来解决养猫问题

        //使用独立变量存储猫猫信息
        //第一只猫信息
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";
        //第二只猫信息
        String cat2Name = "小花";
        int cat2Age = 1;
        String cat2Color = "花色";

        //数组
        //(1)数据类型体现不出
        //(2)只能通过[下标]获取信息，造成变量名字和内容的对应关系不明确
        //(3)不能体现猫的行为
        String [] cat1 = {"小白","3","白色"};
        String [] cat2 = {"小花","1","花色"};

        //使用OOP面向对象解法
        //实例化一只猫[创建一只猫对象]
        //1. new Cat() 创建一只猫
        //2. Cat cat1 = new Cat();把创建的猫赋值给cat1
        Cat cat1_Cat = new Cat();
        cat1_Cat.name="小白";
        cat1_Cat.age=3;
        cat1_Cat.color="白色";
        Cat cat2_Cat = new Cat();
        cat2_Cat.name="小花";
        cat2_Cat.age=1;
        cat2_Cat.color="花色";
        System.out.println("第一只猫名字:" + cat1_Cat.name + "\n年龄:" + cat1_Cat.age + "\n花色:" + cat1_Cat.color);
        System.out.println("第二只猫名字:" + cat2_Cat.name + "\n年龄:" + cat2_Cat.age + "\n花色:" + cat2_Cat.color);
    }
}
//使用面向对象的方式来解决养猫问题
//
//定义一个猫类 -> 自定义的数据类型
class Cat{
    //属性
    String name;//名字
    int age;//年龄
    String color;//毛色
}