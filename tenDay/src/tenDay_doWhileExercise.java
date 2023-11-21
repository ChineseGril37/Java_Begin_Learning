import java.util.Scanner;

public class tenDay_doWhileExercise {
    public static void main(String[] args){
//        1) 打印 1—100
//        2) 计算 1—100 的和
//        3) 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
//        4) 如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
        int i = 1, sum = 0;
        do{
            System.out.println(i);
            sum += i++;
        }while (i <= 100);
        System.out.println("1--100的和:" + sum);
        i = 1;
        sum = 0;
        do {
            if(i % 5 == 0 && i % 3 != 0){
                System.out.println("i=" + i);
                sum++;
            }
            i++;
        }while (i <= 200);
        System.out.println("1---200 之间能被 5 整除但不能被 3 整除的个数:" + sum);
        Scanner myScanner = new Scanner(System.in);
        char choice = 'n';
        do{
            System.out.println("老韩问：还钱吗？y/n");
            choice = myScanner.next().charAt(0);
            if(choice == 'n'){
                System.out.println("闪电五连鞭！");
            }
        }while (choice != 'y');
        System.out.println("老李还钱了,老韩很满意~");
    }
}
