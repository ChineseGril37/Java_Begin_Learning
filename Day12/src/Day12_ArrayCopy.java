public class Day12_ArrayCopy {
    public static void main(String[] args) {
        //将int[] arr1 = {10,20,30};拷贝到arr2数组，要求数据空间是独立的
        int[] arr1 = {10,20,30};
        //int[] arr2 = arr1;
        //创建应该新的数组arr2,开辟新的数据空间
        //大小arr1.length
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr1["+i+"]="+arr1[i]);
        }
        int[] arr2 = new int[arr1.length];
        //
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr2["+i+"]="+arr2[i]);
        }
        //
        for (int i = 0; i < arr1.length; i++){
            arr2[i]=arr1[i];
        }
        System.out.println("===arr1拷贝给arr2===");
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr2["+i+"]="+arr2[i]);
        }
        System.out.println("==修改arr1的值，验证值拷贝==");
        arr1[0]=100;
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr1["+i+"]="+arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr2["+i+"]="+arr2[i]);
        }
    }
}
