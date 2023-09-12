public class threeDay_IntDetail {
    public static void main(String[] args){
        //Java的整型常量(具体值)默认为int型，声明long型常量须后加'l'或'L'
        //Java程序中常量常声明为int型，除非不足以表示大数，才使用long
        //bit:计算机中的最小存储单位。
        //btye：计算机中基本存储单元,1 byte = 8 bit
        int n1 = 1;//四个字节
        //int n2 = 1L;//对不对?不对，硬把8位的数据塞进4位里会出问题
        long n3 = 1L;//对
    }
}
