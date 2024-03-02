public class Day15_MethodParameter01 {
    public static void main(String[] args){
        //对象中方法使用基本数据类型的进行数据交换并不会影响实参
        int a = 3,b = 5;
        System.out.println("a和b交换前的值\na = "+ a + "\tb = " + b);
        AA aa = new AA();
        aa.swap(a,b);
        System.out.println("a和b交换后的值\na = "+ a + "\tb = " + b);
        //对象中方法使用引用数据类型进行数据交换可以影响实参
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("arr交换前的值");
        aa.print(arr);
        aa.arrSwap(arr);
        System.out.println("arr交换后的值");
        aa.print(arr);
    }
}
class AA{
    public void swap(int a,int b){
        System.out.println("AA方法中a和b交换前的值\na = "+ a + "\tb = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("AA方法中a和b交换后的值\na = "+ a + "\tb = " + b);
    }
    public void arrSwap(int[][] arr){
        System.out.println("AA方法中arr交换前的值");
        print(arr);
        for (int row = 0; row <= arr.length/2; row++){
            for (int col = 0; col <= arr[row].length/2; col++){
                int temp = arr[row][col];
                arr[row][col] = arr[arr.length-row-1][arr.length-col-1];
                arr[arr.length-row-1][arr.length-col-1] = temp;
            }
        }
        System.out.println("AA方法中arr交换后的值");
        print(arr);
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
