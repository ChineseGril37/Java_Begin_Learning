public class fiveDay_StringToBasic {
    public static void main(String[] args){
        //基本类型转String类型
        //语法: 将基本类型的值+""即可
        int n1 = 100;
        float f1 = 1.1f;
        double d1 =3.4;
        boolean b1 = true;
        String s1 = n1 +"";
        String s2 = f1 +"";
        String s3 = d1 +"";
        String s4 = b1 +"";
        System.out.println(s1 + '\t' + s2 + '\t' + s3 + '\t' + s4);

        //String -> 对应的基本数据类型
        String s5 = "123";
        //会在OOP 讲对象和方法的时候详细分析
        //解读 使用 基本数据类型对应的包装类的相应方法，得到基本数据类型
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        Long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("ture");
        short num6 = Short.parseShort(s5);
        System.out.println("=========================");
        System.out.println(num1);//123
        System.out.println(num1 + 1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);//false

        //怎么把String转为char -> 含义是指 把字符串的第一个字符得到
        //解读 s5.charAt(1) 得到s5字符串的第一个字符
        System.out.println(s5.charAt(0));//1
    }
}
