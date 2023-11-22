import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        //判断一个年份是否为闰年
        Scanner myScanner = new Scanner(System.in);
        //System.out.println("请输入要判断的年份:");
        //int year = myScanner.nextInt();
        int year;
        for (year = 1970;year<2100;year++){
            if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println(year + "是闰年");
            }/*else {
                System.out.println(year + "不是闰年");
            }*/
        }
    }
}
