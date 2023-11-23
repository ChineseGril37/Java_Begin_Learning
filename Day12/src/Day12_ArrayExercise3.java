public class Day12_ArrayExercise3 {
    public static void main(String[] args) {
        //请求出一个数组的和和平均值
        double[] hens ={3,5,1,3.4,2,50};
        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++){
            totalWeight += hens[i];
        }
        System.out.println("总体重为:" + totalWeight);
        System.out.println("平均体重为:" + totalWeight/hens.length);
    }
}
