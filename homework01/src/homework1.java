public class homework1 {
    public static void main(String[] args) {
        //某人有100000元，每经过一次路口，需要缴费，规则如下：
        //1)当现金>50000时，每次交5%
        //2)当现金<=50000时，每次交1000
        //编程计算该人可以通过多少次路口，要求:使用while,break方式完成
        double cash = 100000;
        int counter = 0;
        while (true){
            if(cash - 1000 <= 0){
                break;
            }
            if(cash > 50000){
                cash*=0.95;
            }else{
                cash-=1000;
            }
            counter++;
            System.out.println("cash="+cash);
        }
        System.out.println("可以通过"+counter+"次路口");
    }
}