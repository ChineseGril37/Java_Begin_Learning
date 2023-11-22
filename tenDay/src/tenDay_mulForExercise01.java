import java.util.Scanner;

public class tenDay_mulForExercise01 {
    public static void main(String[] args){
//        1) 统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
//        2) 统计三个班及格人数，每个班有 5 名同学
        Scanner myScanner = new Scanner(System.in);
        int classnum = 1;
        int studentnum;
        int counter = 0;
        double score;
        double sum_class,sum_total = 0;
        for(;classnum <= 3;classnum++){
            sum_class = 0;
            for (studentnum = 1;studentnum <= 5;studentnum++){
                System.out.println("请输入" + classnum + "班" + studentnum + "号同学成绩:");
                score = myScanner.nextDouble();
                sum_class += score;
                sum_total += score;
                if(score >= 60){
                    counter++;
                }
            }
            System.out.println(classnum + "班的平均分为:" + sum_class/5);
        }
        System.out.println("总平均分为:" + sum_total/15);
        System.out.println("及格人数为:" + counter);
    }
}
