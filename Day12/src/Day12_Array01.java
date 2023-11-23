public class Day12_Array01 {
    public static void main(String[] args) {
        /*
        一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。请问这六只鸡的总体重是多少?平
        均体重是多少? 请你编一个程序。
        思路：
        定义 6 个变量 , 加起来 总体重， 求出平均体重.引出 -> 数组
         */
        //原始版本
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;
        System.out.println("总体重为:" + (hen1+hen2+hen3+hen4+hen5+hen6));
        System.out.println("平均体重为:" + (hen1+hen2+hen3+hen4+hen5+hen6)/6);
        //数组版本
        double[] hens ={3,5,1,3.4,2,50};
        double totalWeight = 0;
        //遍历数组得到数组的所有元素的和， 使用 for
        //1. 我们可以通过 hens[下标] 来访问数组的元素
        //下标是从 0 开始编号的比如第一个元素就是 hens[0]
        //第 2 个元素就是 hens[1] , 依次类推
        //2. 通过 for 就可以循环的访问 数组的元素/值
        //3. 使用一个变量 totalWeight 将各个元素累
        for (int i = 0; i < hens.length; i++){
            totalWeight += hens[i];
        }
        System.out.println("总体重为:" + totalWeight);
        System.out.println("平均体重为:" + totalWeight/hens.length);
    }
}