import java.util.Scanner;
/**
 * switch注意事项和讨论
 * 1.表达式数据类型，应和case后的常量类型一致，或者是可以自动转化成可以相互比较的类型，比如输入的是字符，而常量是int
 * 2.switch(表达式)中表达式的返回类型必须是:(byte,short,int,char,enum,String)
 * double temple = 1.1;
 * switch (temple){
 *     case 1.1://错误
 *         System.out.println("ok3");
 *         break;
 * }
 * 3.case子句中的值必须是常量，而不能是变量。
 * 4.default子句是可选的，当没有匹配的case时，执行default
 * 5.break语句用来在执行完一个case分支之后使程序跳出switch语句块；如果没有写break，程序会顺序执行到switch结尾。
 * 1) 如果判断的具体数值不多，而且符合 byte、 short 、int、 char, enum[枚举], String 这 6 种类型。虽然两个语句都可
 * 以使用，建议使用 swtich 语句。
 * 2) 其他情况：对区间判断，对结果为 boolean 类型判断，使用 if，if 的使用范围更广
 */
public class nineDay_SwitchDetail {
    public static void main(String[] args){
        //表达式数据类型，应和case后的常量类型一致
        //或者是可以自动转化成可以相互比较的类型,比如输入的是字符，而常量是int
        //switch(表达式)中表达式的返回类型必须是:(byte,short,int,char,enum,String)
        char test1 = 'a';
        switch (test1){
            /*case "hello":
                System.out.println("ok1");
                break;*/
            case 'a':
                System.out.println("ok2");
                break;
            case 20:
                System.out.println("ok3");
                break;
            /*case 1.1:
                System.out.println("ok4");
                break;*/
            default:
                System.out.println("ok5");
        }
        //case子句中的值必须是常量，而不能是变量。
        Scanner myScanner = new Scanner(System.in);
        int test3 = myScanner.nextInt();
        int test4 = myScanner.nextInt();
        switch (test3){
            case 1:
                System.out.println("ok1");
                break;
            /*case test4:
                System.out.println("ok1");
                break;*/
            default:
                System.out.println("ok5");
        }
    }
}
