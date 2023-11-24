public class Day13_TwoDimensionalArray02 {
    public static void main(String[] args) {
        //1) 语法: 类型[][] 数组名=new 类型[大小][大小]
        //2) 比如: int a[][]=new int[2][3]
        //3) 使用演示
        //4) 二维数组在内存的存在形式(!!画图)
        //int arr [][] = new int[2][3];
        //一步到位和两步的动态初始化
        int arr [][];
        arr =new int[2][3];
        arr [1][1] = 8;
        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
