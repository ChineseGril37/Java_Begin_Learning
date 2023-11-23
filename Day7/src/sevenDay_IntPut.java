import java.util.Scanner;//表示把java.util下的Scanner类导入
public class sevenDay_IntPut {
    public static void main(String[] args) {
        //演示接受用户的输入
        //步骤
        //Scanner类 表示 简单文本扫描器，在java.util 包
        //1. 引入Scanner类所在的包
        //2. 创建Scanner 对象，new创建一个对象，体会
        // myScanner 就是Scanner类的对象
        Scanner myScanner = new Scanner(System.in);
        //3. 接收用户输入，使用 相关的方法
        System.out.println("请输入名字");
        String name = myScanner.next();//接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();//接收用户输入Int
        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();//接收用户输入Double
        System.out.println("员工信息如下：");
        System.out.println("name = " + name + "\nage = " + age + "\nsalary = " + salary);
    }
}