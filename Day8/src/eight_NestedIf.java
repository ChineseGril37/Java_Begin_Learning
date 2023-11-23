import java.util.Scanner;
public class eight_NestedIf {
    public static void main(String[] args){
        /*
        参加歌手比赛，如果初赛成绩大于8.0进入决赛，
        否则提示淘汰。并根据性别提示进入男子组嚯女子组。

        提示:double score; char gender;
        接收字符: char gender = scanner.next().charAt(0)
         */
        //思路分析
        //1.创建Scanner对象，接收用户输入
        //2.接收成绩保存到double score
        //3.使用if-else判断，如果初赛成绩大于8.0进入决赛，否则提示淘汰
        //4.如果进入到决赛，再接收char gender，使用if-else输出信息
        //代码实现
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩:");
        double score = myScanner.nextDouble();
        if( score > 8.0 ){
            System.out.println("请输入该歌手的性别:");
            char gender = myScanner.next().charAt(0);
            if( gender == '男' ){
                System.out.println("进入男子组！");
            }
            else if( gender == '女' ){
                System.out.println("进入女子组！");
            }
            else {
                System.out.println("性别输入有误，请重新输入！");
            }
        }
        else{
            System.out.println("对不起！选手已被淘汰");
        }
    }
}
