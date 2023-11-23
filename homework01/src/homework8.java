public class homework8 {
    public static void main(String[] args) {
        //求1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+100)的结果
        int temp = 0,sum = 0;
        for (int i = 1; i <= 100; i++){
            temp +=i;
            sum +=temp;
        }
        System.out.println("sum = " + sum);
    }
}
