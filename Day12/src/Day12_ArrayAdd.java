import java.util.Scanner;

public class Day12_ArrayAdd {
    public static void main(String[] args) {
        /*
        要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
        1.原始数组使用静态分配 int[] arr = {1,2,3}
        2.增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
        3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
        思路分析
        1. 定义初始数组 int[] arr = {1,2,3}//下标 0-2
        2. 定义一个新的数组 int[] arrNew = new int[arr.length+1];
        3. 遍历 arr 数组，依次将 arr 的元素拷贝到 arrNew 数组
        4. 将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
        5. 让 arr 指向 arrNew ; arr = arrNew; 那么 原来 arr 数组就被销毁
        6. 创建一个 Scanner 可以接受用户输入
        7. 因为用户什么时候退出，不确定，老师使用 do-while + break 来控制
        */
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        char judge = 'y';
        do{
            System.out.println("请输入要添加的值");
            int input = myScanner.nextInt();
            int[] temp = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++){
                temp[i]=arr[i];
            }
            temp[arr.length]=input;
            arr=temp;
            System.out.println("添加成功，是否继续？y/n");
            judge = myScanner.next().charAt(0);
        }while (judge == 'y');
        System.out.println("你退出了添加..."+'\n'+"====arr 扩容后元素情况====");
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
