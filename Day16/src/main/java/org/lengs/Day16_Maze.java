package org.lengs;

public class Day16_Maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        Maze maze = new Maze();
        map[3][1]=1;
        map[3][2]=1;
        for (int row = 0; row < map.length - 1; row++){
            map[row][0]=1;
            map[row][6]=1;
            map[0][row]=1;
            map[7][row]=1;
            map[4][row]=1;
        }
        maze.printMaze(map);
        System.out.println("=====找路情况如下=====");
        if(!maze.findway(map, 1, 1)){
            System.out.println("没有能够出去的路!");
        }
        maze.printMaze(map);
    }
}
class Maze{
    public void printMaze(int[][] map){
        for (int row = 0; row < map.length; row++){
            for (int col = 0; col < map[row].length; col++){
                System.out.print(map[row][col]+" ");
            }
            System.out.println();
        }
    }
    //使用递归回溯方法来解决老鼠出迷宫
    // 0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过但是走不通
    //当map[6][5] = 2 时，探测结束，迷宫走通
    //确定老鼠找路策略: 下->右->上->左
    public boolean findway(int[][] map, int row, int col){
        if(map[6][5] == 2){
            return true;
        }else {
            if(map[row][col] == 0){//当前所处位置=0，表示可以走
                //我们假定可以走通
                map[row][col] = 2;
                //使用找路策略,来确定该位置是否真的可以走通:下->右->上->左
                if(findway(map,row+1,col)){
                    return true;
                }else if (findway(map,row,col+1)){
                    return true;
                } else if (findway(map,row-1,col)) {
                    return true;
                }else if (findway(map,row,col-1)) {
                    return true;
                }else {
                    map[row][col] = 3;
                    return false;
                }
            }else {//map[row][col] = 1,2,3
                return false;
            }
        }
    }
}