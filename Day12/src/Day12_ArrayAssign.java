public class Day12_ArrayAssign {
    public static void main(String[] args) {
        //1) 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
        //赋值方式为值拷贝。n2的变化，不会影响到n1的值
        //int n1 = 2; int n2 = n1;
        //2) 数组在默认情况下是引用传递，赋的值是地址
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
        //是同一个地址，arr2变化会影响到arr2
        arr1[0]= 3;
        System.out.println(arr2[0]);//n2[0]=&n1[0]=3
    }
}
