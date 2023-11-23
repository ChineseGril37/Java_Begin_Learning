import java.util.Scanner;
public class Day12_ArrayReduce {
    public static void main(String[] args){
        //有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩
        //下最后一个元素，提示，不能再缩减。
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        char judge;
        do{
            if(arr.length == 1){
                System.out.println("不能再缩减");
                break;
            }
            System.out.println("开始对数组进行缩减");
            int[] temp = new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i++){
                temp[i]=arr[i];
            }
            arr=temp;
            System.out.println("缩减成功，是否继续？y/n");
            judge = myScanner.next().charAt(0);
        }while(judge == 'y');
        System.out.println("你退出了缩减..."+'\n'+"====arr 缩减后元素情况====");
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
