package org.lengs;

public class Day16_VarParameter {
    public static void main(String[] args){
        
    }
}
class HspMethod{
    //可以计算 2个数的和,3个数的和,4、5个...
    public int sum(int n1, int n2){//2个数的和
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3){//3个数的和
        return n1 + n2 + n3;
    }
    public int sum(int n1, int n2, int n3, int n4){//4个数的和
        return n1 + n2 + n3 + n4;
    }
    //上面三个方法名称相同，功能相同，参数个数不同->使用可变参数优化
    //1.int...表示接受的是可变参数，类型是int，既可以接收多个int(0-多)
    //2.使用可变参数时，可以当作数组来使用 即nums可以当作数组
    public int varSum(int... nums){
        System.out.println("接受的参数个数=" + nums.length);
        return 1;
    }
}
