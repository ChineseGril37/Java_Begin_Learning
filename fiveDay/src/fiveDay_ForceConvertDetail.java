public class fiveDay_ForceConvertDetail {
    public static void main(String[] args){
        //细节1 当进行数据的大小从 大->小, 就需要使用到强制转换
        //细节2 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        //int x = (int)10*3.5+6*1.5;//编译错误: double -> int
        int y = (int)(10*3.5+6*1.5);//(int)44.0 -> 44
        System.out.println("y=" + y);//44
        //细节3 char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        char c1 =100;//ok
        int m = 100;//ok
        //char c2 = m;//wrong
        char c3 = (char)m;//ok
        System.out.println("c3=" + c3);//d
        //细节4 byte和short类型在进行运算时，当作int类型处理
    }
}
