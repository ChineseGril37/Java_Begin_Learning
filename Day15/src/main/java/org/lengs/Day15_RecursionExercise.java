package org.lengs;
public class Day15_RecursionExercise {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci(5)=" + fibonacci.Fibonacci(5));
        /*
        猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!
        以后每天猴子都吃其中的一半+一个，当到第十天时，再想吃(还没吃)，发现只有一个桃子了
        问题：最初共有多少个桃子？
         */
        Monkey m1 = new Monkey();
        System.out.println("EatPeach(10)=" + m1.EatPeach(10));
    }
}
class Fibonacci{
    public int Fibonacci(int n){
        if(n < 2){
            return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
class Monkey{
    public int EatPeach(int days){
        if(days == 1){
            return 1;
        }else {
            return (EatPeach(days-1)+1)*2;
        }
    }
}
