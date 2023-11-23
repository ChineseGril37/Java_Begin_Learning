public class Day12_ArrayReverse {
    public static void main(String[] args) {
        //要求：把数组的元素内容反转
        //arr{11,22,33,44,55,66} arrReverse{66, 55,44,33,22,11}
        //直接交换
        int[] arr = {11,22,33,44,55,66};
        System.out.println("交换前的arr数组为:");
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
        for (int i = 0; i < (arr.length-1)/2; i++){
            int temp = arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }
        System.out.println("交换后的arr数组为:");
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
        //方式 2：使用逆序赋值方式
        System.out.println("====使用逆序赋值方式====");
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        System.out.println("交换前的arr数组为:");
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr1["+i+"]="+arr1[i]);
        }
        int[] temp = new int[arr1.length];
        for (int i = 0 ; i < arr1.length; i++){
            temp[i] = arr1[arr1.length-i-1];
        }
        arr1=temp;
        System.out.println("交换后的arr1数组为:");
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr1["+i+"]="+arr1[i]);
        }
    }
}
