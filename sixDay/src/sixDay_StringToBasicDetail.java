/**
 * 演示字符串转基本数据类型的细节
 * 1.在将String类型转成基本数据类型是，要确保String类型能够转成有效的数据，
 * 比如我们可以把“123”转成一个整数，但不能把“hello”转成一个整数
 * 2.如果格式不正确，就会抛出异常，程序就会终止，这个问题在异常处理章节中，会处理
 */
public class sixDay_StringToBasicDetail {
    public static void main(String[] args) {
        String str =  "123";
        int n1 = Integer.parseInt(str);
        System.out.println("n1=" + n1);//输出n1=123
        str = "hello";
        n1 = Integer.parseInt(str);
        System.out.println("n1=" + n1);//编译不出错但运行错误
        //编译器不检测内容
    }
}