import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        /*
        实现判断一个整数，属于哪个范围:大于0；小于0；等于0
        思路：定义int n = 22;使用if -- else if --else即可
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要判断的整数:");
        int input = myScanner.nextInt();
        if(input > 0){
            System.out.println(input + "大于0");
        } else if (input < 0) {
            System.out.println(input + "小于0");
        }else {
            System.out.println(input + "等于0");
        }
    }
}
