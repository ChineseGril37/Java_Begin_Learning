package org.lengs;
public class Day15_Method02 {
    public static void main(String[] args) {
        //请遍历一个数组，输出数组的各个元素值
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};

        //遍历map数组
        //传统的解决办法就是直接遍历
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print("map[" + i + "][" + j + "]=" + map[i][j] + '\t');
            }
            System.out.println();
        }
    }
}
