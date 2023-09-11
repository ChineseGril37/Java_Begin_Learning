/*演示转义字符的使用
\t:一个制表位、实现对齐的功能
\n:换行符
\:一个\
\":一个"
\':一个'
\r:一个回车 System.out.println("Hello\rWorld!");
 */
public class oneDay_ChangeChar {
    public static void main(String[] args){
        System.out.println("北京\t天津\t上海");
        System.out.println("北京\n天津\n上海");
        System.out.println("北京\\天津\\上海");
        System.out.println("北京\"天津\"上海");
        System.out.println("北京\'天津\'上海");
        System.out.println("北京的爷就是爷\r上海");
        /*
        回车\r和换行\n的区别：
        换行会另起一行把光标提到最前
        回车idea会直接干掉前面所有字符把光标提到当前行最前，输出"上海"
        cmd中会直接把光标提到当前行的最前，但并不会干掉它路过的字符。/r的效果会输出"上海的爷就是爷"
         */
        //小测试
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
    }
}
