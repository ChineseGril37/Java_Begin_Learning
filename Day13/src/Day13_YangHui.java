public class Day13_YangHui {
    public static void main(String[] args) {
        //1) 使用二维数组打印一个 10 行杨辉三角
        int arr [][] = new int[10][];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[i+1];
            for (int j = 0; j < arr[i].length; j++){
                if(j == 0 || j == arr[i].length-1){
                    arr[i][j] = 1;
                } else if ( i >= 2) {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
