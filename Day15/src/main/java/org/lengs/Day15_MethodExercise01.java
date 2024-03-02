package org.lengs;

public class Day15_MethodExercise01 {
    public static void main(String[] args){
        AA aa = new AA();
        int n = 5;
        if(aa.numJudge(n)){
            System.out.println("n是偶数");
        }
        else {
            System.out.println("n不是偶数");
        }
        int[][] temp={{0,0,1},{1,1,1},{1,1,3}};
        aa.print(temp);
    }
}
class AA{
    public boolean numJudge(int num){
        return num % 2 == 0;
    }
    public void print(int[][] map){
        for (int row = 0; row < map.length; row++){
            for (int col = 0; col < map[row].length; col++){
                System.out.print("map[" + row + "][" + col + "]=" + map[row][col] + '\t');
            }
            System.out.println();
        }
    }
}
