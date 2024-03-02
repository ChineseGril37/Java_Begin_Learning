package org.lengs;
public class Day15_Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(5);
        System.out.println("1+2="+p1.getsum(1,2));
    }
}
class Person{
    String name;
    int age;
    //方法(成员方法)
    //添加speak成员方法,输出“我是一个好人”
    //1.public修饰符表示方法是公开
    //2.void表示方法没有返回值
    //3.speak()中speak是方法名，()形参列表
    //4.{}中包括方法体,包含方法的执行代码
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int res = 0;
        for (int i =1; i <= 1000; i++){
            res += i;
        }
        System.out.println("计算结果=" + res);
    }
    public void cal02(int n){
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += i;
        }
        System.out.println("计算结果=" + res);
    }
    public int getsum(int sum1,int sum2){
        return  sum1+sum2;
    }
}