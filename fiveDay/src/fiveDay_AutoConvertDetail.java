public class fiveDay_AutoConvertDetail {
    public static void main(String[] args) {
        //有多种类型的数据混合运算时，
        //系统首先自动将所有数据VT转换成容量最大的那种数据类型，然后再进行计算
        int n1 = 10;//ok
        //float d1 = n1 + 1.1;//错误 n1 + 1.1 => 结果类型是 double
        //java: 不兼容的类型: 从double转换到float可能会有损失
        //解决方案
        double d2 = n1 + 1.1;
        float d3 = n1 + 1.1F;//1.1F的类型是float

        //当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型是，
        //就会报错，反之就会进行自动类型转换
        //int n2 = 1.1;//错误，1.1 => double

        //(byte, short) 和 char之间不会相互自动转换
        //当把数赋值给byte时，(1)先判断该数是否在byte范围内，如果是就可以
        //
        byte b1 = 10;//正确，byte范围 -128~127
        int n2 = 1;//n2 是int
        //byte b2 = n2;//错误 原因：如果是变量赋值，判断了类型
        // 正在把一个空间为4字节大小的int类型塞进1字节大小的byte

    }
}