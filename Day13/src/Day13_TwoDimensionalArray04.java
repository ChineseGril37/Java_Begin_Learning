public class Day13_TwoDimensionalArray04 {
    public static void main(String[] args) {
        /*
        定义 类型 数组名[][] = {{值 1,值 2..},{值 1,值 2..},{值 1,值 2..}}
        使用即可 [ 固定方式访问 ]
        比如:
        int[][] arr = {{1,1,1}, {8,8,9}, {100}};
        解读
        1. 定义了一个二维数组 a
        2. arr 有三个元素(每个元素都是一维数组)
        3. 第一个一维数组有 3 个元素 , 第二个一维数组有 3 个元素, 第三个一维数组有 1 个元素
        */
        int arr[][] = {{1,2,3},{2,3,4},{5,6,7}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
