public class Day13_TwoDimensionalArray01 {
    public static void main(String[] args) {
        /*
        请用二维数组输出如下图形
        0 0 0 0 0 0
        0 0 1 0 0 0
        0 2 0 3 0 0
        0 0 0 0 0 0
        */
        int[][] arr = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 2, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0} };
        System.out.println("第 3 个一维数组的第 4 个值=" + arr[2][3]); //3
        //输出二维图形
        for(int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
            //遍历二维数组的每个元素(数组)
            //老韩解读
            //1. arr[i] 表示 二维数组的第 i+1 个元素 比如 arr[0]：二维数组的第一个元素
            //2. arr[i].length 得到 对应的 每个一维数组的长度
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); //输出了一维数组
            }
            System.out.println();//换行
        }
    }
}