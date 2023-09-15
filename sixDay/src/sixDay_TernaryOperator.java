public class sixDay_TernaryOperator {
    public static void main(String[] args){
        int a = 10;
        int b =99;
        int result = a > b ? a++ : b--;
        System.out.println("a = "+ a + "\tb = " + b + "\tresult = " + result);
        //细节1 表达式1和表达式2要为可以赋给接受变量的类型（或可以自动转换）
        //细节2 三元运算符可以转成if-else语句
        if( a > b ){
            result = a--;
        }else{
            result = b++;
        }
        System.out.println("a = "+ a + "\tb = " + b + "\tresult = " + result);
        //随堂练习：实现三个数的最大值
        //1.先得到d和e中最大的数
        //2.再求出max1和f中的最大数
        int d = 1;
        int e = 2;
        int f = 3;
        int ans = (d > e ? d : e) > f ? (d > e ? d : e) : f;
        System.out.println("ans = " + f);

    }
}
