public class elevenDay_breakExercise {
    public static void main(String[] args){
        //1) 1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
        int sum = 0,i;
        for (i = 1; i <= 100; i++){
            sum += i;
            System.out.println("sum=" + sum);
            if(sum >= 20){
                break;
            }
        }
        System.out.println("sum第一次大于20时的当前数：" + i);
    }
}
