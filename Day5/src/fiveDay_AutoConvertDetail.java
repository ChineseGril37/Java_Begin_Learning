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
        //char c1 = b1;//错误 ：byte和char之间不能进行自动类型转换

        //细节4 byte,short,char 他们三者可以计算，在计算时首先转换为int类型
         byte b2 = 1;
         byte b3 = 2;
         short s1 = 1;
         //short s2 = b2 + s1;//错误, b2 + s1 => int, int赋值给short报错
         int s2 = b2 + s1;

         //byte b4 = b2 + b3;//错误, b2 + b3 => int

        //细节5 boolean类型不参与转换
        boolean pass = true;
        //int num = pass;// boolean 不参与类型的自动转换

    }
}