//基本数据类型转换
//数据类型按精度(容量)大小排序为(背，规则)
//char->int->long->float->double
//byte->short->int->long->float->double
public class fourDay_AutoConvert {
    public static void main(String[] args){
        //演示自动转换
        int a = 'a';//ok char->int
        double d = 80;//ok int->double
        System.out.println(a);//97
        System.out.println(d);//80.0
    }
}
