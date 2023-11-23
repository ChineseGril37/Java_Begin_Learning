import java.util.Scanner;
/**
 * 1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"。
 * 2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
 * 3) 根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 [课堂练习, 提示 使
 * 用穿透 ]
 */
public class nineDay_SwitchExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要转化的字母:");
        char input = myScanner.next().charAt(0);
        switch (input){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }
        System.out.println("请输入分数:");
        double score = myScanner.nextDouble();
        if(score > 0 && score <= 100){
            switch ((int)(score/60)){
                case 0:
                    System.out.println("不合格");
                    break;
                default:
                    System.out.println("合格");
            }
        }else {
            System.out.println("输入有误！");
        }
        System.out.println("请输入月份");
        byte month = myScanner.nextByte();
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("芝士冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("芝士春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("芝士夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("芝士秋季");
                break;
            default:
                System.out.println("芝士输错了");
        }
    }
}
