import java.util.Scanner;
public class eight_NestedIf_test {
    public static void main(String[] args){
        /*
        出票系统：根据淡旺季的月份和年龄，打印票价
        4~10 旺季:
            成人 (18-60):60
            儿童 (<18):成人半价
            老人 (>60):成人1/3
        淡季:
            成人:40
            其他:20
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入购票月份:");
        byte month = myScanner.nextByte();
        System.out.println("请输入购票者年龄:");
        byte age = myScanner.nextByte();
        byte count;
        //判断month是否为淡旺季，是进入淡季count，否则进入旺季count
        if ( month < 4 || month >10 ){
            //判断age是否为18-60，否则进入其他
            if ( age > 18 && age < 60){
                count = 40;
            }
            else {
                count = 20;
            }
        }
        else{
            count = 60;//基础count为60(成人价)
            if ( age < 18 ){
                count /= 2;//儿童价
            } else if ( age >60 ) {
                count /= 3;//老人价
            }
        }
        System.out.println("票价为:" + count + "元");//最终输出count价格，不必在if语句中重复添加代码
    }
}
