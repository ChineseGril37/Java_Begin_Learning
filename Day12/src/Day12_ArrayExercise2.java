public class Day12_ArrayExercise2 {
    public static void main(String[] args) {
        //2) 请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
        int[] max = {4,-1,9, 10,23};
        int temp = max[0],loacl = 0;
        for (int i = 0; i < max.length; i++){
            if(max[i] >temp){
                temp = max[i];
                loacl = i;
            }
        }
        System.out.println("数组的最大值="+temp+",下标="+loacl);
    }
}
