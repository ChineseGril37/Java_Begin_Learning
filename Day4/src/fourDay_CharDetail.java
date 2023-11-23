public class fourDay_CharDetail {
    public static void main(String[] args){
        /*
        字符类型char使用细节
        1.字符常量是用单引号('')括起来的单个字符。例如：
        char c1 = 'a'; char c2 = '中'; char c3 = '9';
        2.Java中还允许使用转义字符'\'来将其后的字符转变为特殊字符型常量。
        例如：char c3 = '\n';
        '\n'代表换行符
        3.在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
        http://tool.chinaz.com/Tools/Unicode.aspx
        4.可以直接给char赋值一个整数，然后输出时，会按照对应的unicode字符输出[97]
        5.char类型是可以进行运算的，相当于一个证书，因为它都对应有Unicode码。
         */
        char c1 = 'a';
        //char c2 = a;
        char c3 = '9';
        char c4 = 97;
        char c5 = '\n';
        char c6 = '韩';
        char c7 = 38889;
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }
}
