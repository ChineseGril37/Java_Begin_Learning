import java.util.Scanner;

public class tenDay_mulForStars {
    public static void main(String[] args){
        //使用 for 循环完成下面的案例
        //请编写一个程序，可以接收一个整数,表示层数（totalLevel），打印出金字塔。
        //先来实心的
        Scanner myScanner = new Scanner(System.in);;
        System.out.println("请输入想生成的层数:");
        int level = myScanner.nextInt();
        for (int i = 0 ; i < level; i++){
            for (int j = 1; j <= level-i; j++){
                System.out.print(' ');
            }
            for (int j = 1 ; j <= 1+i*2; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
        //再来空心的
        System.out.println("请输入想生成的层数:");
        level = myScanner.nextInt();
        for (int i = 0 ; i < level; i++){
            for (int j = 1; j <= level-i; j++){
                System.out.print(' ');
            }
            for (int j = 1 ; j <= 1+i*2; j++){
                if(j == 1 || j == 1+i*2 || i == level-1){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
