/**
 * 演示逻辑运算符的使用
 */
public class sixDay_LogicOperator {
    public static void main(String[] args){
        //&& 和 & 案例演示
        int age = 50;
        if(age > 20 && age < 30)
            System.out.println("20 < age < 30");
        // & 逻辑与使用
        if(age > 20 & age < 90)
            System.out.println("20 < age < 90");
        //区别
        int a = 4;
        int b = 9;
        //对于&逻辑与而言，如果第一个条件为false，后面的条件继续判断
        //对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
        if(a < 1 && ++b < 5)//false
            System.out.println("OK300");
        System.out.println("a = " + a + "\tb = "+ b);//a = 4	b = 9
        if(a < 1 & ++b < 50)//false
            System.out.println("OK300");
        System.out.println("a = " + a + "\tb = "+ b);//a = 4	b = 10
    }
}
