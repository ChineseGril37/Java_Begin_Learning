import java.util.Scanner;
public class eightDay_If {
    public static void main(String[] args) {
        //编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
        //则输出“你的年龄大于18，要对自己的行为负责，送入监狱”
        //思路分析
        //1.接收输入的年龄，应该定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        //2.把年龄保存到一个变量 int age
        int age = myScanner.nextInt();
        //3.使用if判断，输出对应信息
        if (age >= 18){
            System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱!");
        }else{
            System.out.println("你的年龄小于18，下次注意!");
        }
    }
}
