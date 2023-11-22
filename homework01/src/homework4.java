public class homework4 {
    public static void main(String[] args) {
        /*
        判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身
        例如:153=1^3+3^3+5^3
         */
        for(int i = 100; i <= 999 ; i++){
            int hundred = i/100;
            int ten = i%100/10;
            int one = i % 10;
            int sum = hundred*hundred*hundred+ten*ten*ten+one*one*one;
            if(sum == i){
                System.out.println("水仙花数为:" + i);
            }
        }
    }
}
