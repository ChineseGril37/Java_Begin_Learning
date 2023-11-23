import java.util.Scanner;

public class Day12_Array02 {
    public static void main(String[] args) {
        //演示 数据类型 数组名[]=new 数据类型[大小]
        //循环输入5个成绩，保存到double数组，并输出
        //步骤
        //(1)第一种动态分配方式
        //double score[]= new double[5];
        //(2)第二种动态分配方式，先声明数组，再new分配空间
        //double score[];//声明数组，这时score 是 null
        //score = new double[5];
        //(3)第三种静态分配方式
        double[] score = {2,3,4,5,6};
        Scanner myScanner = new Scanner(System.in);
        for (int i =0; i < score.length; i++){
            System.out.println("请输入第" + (i+1) + "个元素的值");
            score[i] = myScanner.nextDouble();
        }
        System.out.println("==数组的元素/值的情况如下==");
        for (int i =0; i < score.length; i++){
            System.out.println("第" + (i+1) + "个元素的值=" + score[i]);
        }
    }
}
