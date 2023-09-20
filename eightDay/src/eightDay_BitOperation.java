public class eightDay_BitOperation {
    public static void main(String[] args) {
        int a = 1 >> 2;//1向右位移两位
        int b = -1 >> 2;//-1向右位移两位
        int c = 1 << 2;//1向左位移两位
        int d = -1 << 2;//-1向左位移两位
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}