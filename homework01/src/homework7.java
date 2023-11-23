public class homework7 {
    public static void main(String[] args) {
        //求出1-1/2+1/3-1/4.....1/100的和
        double sum = 0;
        for (double i = 1; i <= 100; i++){
            if(i%2==0){
                sum -= 1/i;
            }else {
                sum += 1/i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
