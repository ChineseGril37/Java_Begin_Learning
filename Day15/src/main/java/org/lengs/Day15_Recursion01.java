package org.lengs;
public class Day15_Recursion01 {
    public static void main(String[] args){
        T test = new T();
        test.test(10);
        test.test2(10);
    }
}
class T{
    public void test(int n){
        if(n > 1){
            test(n - 1);
        }
        System.out.println("n = " + n);
    }
    public void test2(int n){
        if(n > 1){
            test(n - 1);
        }else {
            System.out.println("n = " + n);
        }
    }
}
