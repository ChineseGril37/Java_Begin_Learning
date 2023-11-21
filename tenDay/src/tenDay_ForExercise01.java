public class tenDay_ForExercise01 {
    public static void main(String[] args) {
        //1) 打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.[化繁为简,先死后活]
        int sum = 0;
        int counter = 0;
        for(int temple = 9; temple <= 100; temple++){
            if(temple % 9 == 0) {
                counter+=temple;
                sum++;
            }
        }
        System.out.println("1~100之间所有是9的倍数的整数的个数为:" + counter);
        System.out.println("1~100之间所有是9的倍数的整数的总和为:" + sum);
    }
}
