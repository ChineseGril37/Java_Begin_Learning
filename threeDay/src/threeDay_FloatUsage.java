//关于浮点数在机器中存放形式的简单说明：浮点数=符号位+指数为+尾数位
//尾数部分可能丢失，造成精度损失(类似无限循环小数不可能全部存下，小数都是近似值)
public class threeDay_FloatUsage {
    public static void main(String[] args) {
        /*
        1.与整数类型类似，Java浮点类型也有固定的范围和字段长度，不受具体OS
        的影响。[float 4个字节 double 8个字节]
        2.Java的浮点型常量(具体值)是默认为double型，声明float型常量，须后加
        ’f‘或‘F’
        3.浮点型常量有两种表示形式
            十进制数形式，如:5.12 512.0f .512 (必须有小数点)
            科学计数法形式，如: 5.12e2[] 5.12E-2[]
        4.通常情况下，应该使用double型，因为它比float型更精确
        [举例]
            double num9 = 2.1234567851;
            float num10 = 2.1234567851F;
        5.浮点数使用陷阱:2.7 和 8.1/3 比较
         */
        //float num1 = 1.1;//对不对？不对，1.1是double类型
        float num2 = 1.1F;//正确形式
        double num3 = 1.1;//也对
        double num4 = 1.1f;//也对,小箱子可以塞进大箱子，大箱子不能塞进小箱子
        double num5 = .123;//等价0.123
        System.out.println(num5);
        //科学计数法形式，如: 5.12e2[] 5.12E-2[]
        System.out.println(5.12e2);//512.0
        System.out.println(5.12e-2);//0.0512
        //double保留的字符更多
        double num9 = 2.1234567851;
        float num10 = 2.1234567851F;
        System.out.println(num9);//2.1234567851
        System.out.println(num10);//2.1234567
        //浮点数使用陷阱
        double num11 = 2.7;
        double num12 = 2.7;//8.1 / 3;// = 2.7
        System.out.println(num11);//2.7
        System.out.println(num12);//2.6999999999999997 接近2.7的一个小数而不是2.7
        //重要使用点：当我们对运算结果是小数的进行相等判断时，要小心
        //应该是以两个数的差值的绝对值，在某个精度范围内判断
        if( num11 == num12 ){//判断值永假
            System.out.println("相等");
        }
        //正确的写法,"ctrl + /":注释快捷键
        if(Math.abs(num11 - num12) < 0.001){
            System.out.println("差值非常小，到我的规定精度，认定相等");
        }
        //可以通过Java API来看
        System.out.println("差值为:" + Math.abs(num11 - num12));

        //细节:如果是直接查询得到的小数或者直接赋值，是可以判断相等的
    }
}
