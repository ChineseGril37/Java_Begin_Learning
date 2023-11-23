/*程序中+号的使用
1.当左右两边都是数值型时，则做加法运算
2。当左右两边有一方为字符串，则做拼接运算
 */

public class threeDay_PlusUsage {
    public static void main(String[] args){
        System.out.println(100 + 98);//加法198
        System.out.println("100" + 98);//拼接10098
        System.out.println(100 + 98 + "hello");//先加法后拼接198hello
        System.out.println("hello" + 100 + 3);//全拼接hello1003
    }
}
