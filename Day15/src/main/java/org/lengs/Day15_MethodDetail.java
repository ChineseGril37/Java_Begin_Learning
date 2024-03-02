package org.lengs;

public class Day15_MethodDetail {
    public static void main(String[] args){
        A a =new A();
        a.sayOK();
        a.transTestB();
    }
}
class A{
    public void print(int n){
        System.out.println("print方法被调用，n = "+ n);
    }
    //同一类中方法的互相调用
    public void sayOK(){
        int n = 10;
        print(n--);
        System.out.println("sayOK方法被调用，n = "+ n);
    }
    public void transTestB(){
        B b = new B();
        b.hi();
        System.out.println("A类中的transTestB()被调用");
    }
}
class B{
    public void hi(){
        System.out.println("B类中的hi()被调用");
    }
}
