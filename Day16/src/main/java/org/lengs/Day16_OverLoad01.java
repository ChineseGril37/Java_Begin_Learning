package org.lengs;

public class Day16_OverLoad01 {
    public static void main(String[] args){
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1,2));
        System.out.println(mc.calculate(1,2.3));
        System.out.println(mc.calculate(1.2,3));
        System.out.println(mc.calculate(1,2,3));
    }
}
class MyCalculator{
    //下面四个calculate方法构成了重载
    //两个整数的和
    public int calculate(int n1,int n2){
        System.out.println("calculate(int n1,int n2)被调用");
        return n1 + n2;
    }
    public double calculate(int n1, double n2){
        System.out.println("calculate(int n1, double n2)被调用");
        return n1 + n2;
    }
    public double calculate(double n1, int n2){
        System.out.println("calculate(double n1, int n2)被调用");
        return n1 + n2;
    }
    public int calculate(int n1,int n2, int n3){
        System.out.println("calculate(int n1,int n2, int n3)被调用");
        return n1 + n2 + n3;
    }
}
