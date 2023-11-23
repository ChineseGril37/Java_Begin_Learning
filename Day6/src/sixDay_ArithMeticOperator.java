/**
 * 演示算术运算符的使用
 */
public class sixDay_ArithMeticOperator {
    public static void main(String[] args){
        //使用
        System.out.println(10 / 4);//从数学来看是2.5，Java中为2(int类型）
        System.out.println(10.0 / 4);//float类型才会是2.5
        // 注释快捷键 ctrl + /,再次输入 ctrl + / 取消注释
        double d = 10 / 4;
        System.out.println(d);//是2.0
        // % 取模，取余
        //在Java中取模 % 的本质:公式 a % b = a - a / b * b
        //-10 % 3 => -10 - (-10) / 3 * 3 =-10 + 9 = -1
        //10 % -3 => 10 - 10 / (-3) * (-3) = 10 - 9 = 1
        //-10 % -3 => -10 - (-10) / (-3) * (-3) =-10 + 9 =-1
        System.out.println(10 % 3);//结果为1
        System.out.println(-10 % 3);//结果为-1
        System.out.println(10 % -3);//结果为1
        System.out.println(-10 % -3);//结果为-1
    }
}
