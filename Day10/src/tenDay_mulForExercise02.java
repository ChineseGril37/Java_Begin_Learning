public class tenDay_mulForExercise02 {
    public static void main(String[] args){
        //3) 打印出九九乘法表d
        for(int one = 1; one <= 9; one++){
            for(int two = 1; two <= one; two++){
                System.out.print(one + "*" + two + "=" + one*two + '\t');
            }
            System.out.print('\n');
        }
    }
}
