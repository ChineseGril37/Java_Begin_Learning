public class Day12_ArrayDetail {
    public static void main(String[] args) {
        //1.数组是多个相同类型数据的组合，实现对这些数据的统一管理
        //int[] arr1 = {1,2,3,4,5.1};//double->int
        double[] arr2 = {1.1,2.2,3.3,6.6,100};//int -> double
        //2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
        String[] arr3 = {"北京","1999","jack"};
        //3.数组创建后，如果没有赋值，有默认值. int=0;short=0;byte=0;long=0;
        // float=0.0;double=0.0;char=\u0000;boolean=false;String=null
        short[] arr4= new short[3];
        System.out.println("====数组arr4====");
        for (int i = 0; i<arr4.length;i++){
            System.out.println(arr4[i]);
        }
        //4.使用数组的步骤1)声明数组并开辟空间2)给数组各个元素赋值3)使用数组
        //5.数组的下标从0开始
        //6.数组下标必须再指定范围内使用，否则报:下标越界异常
        //7.数组属于引用类型，数组型数据是对象(object)
    }
}
