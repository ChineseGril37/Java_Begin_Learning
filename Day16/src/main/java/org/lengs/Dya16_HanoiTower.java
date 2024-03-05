package org.lengs;

public class Dya16_HanoiTower {
    public static void main(String[] args) {
        HanoiTower hanoi = new HanoiTower();
        hanoi.move(2,'A','B','C');
    }
}
class HanoiTower{
    //方法
    //num表示要移动的个数，a、b、c分别代表A塔、B塔、C塔
    public void move(int num, char a, char b,char c){
        if(num == 1){
            System.out.println(a + "->" + c);
        }else {
            //如果有多个盘,可以看成两个,最下面的和上面的所有盘(num-1)
            //(1)先移动上面所有的盘到B，借助C
            move(num-1, a,c,b);
            //(2)把最下面的盘,移动到C
            System.out.println(a + "->" + c);
            //(3)借助A把B的所有盘移动到C
            move(num-1, b,a,c);
        }
    }
}
