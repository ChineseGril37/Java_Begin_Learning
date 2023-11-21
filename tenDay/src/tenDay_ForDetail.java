public class tenDay_ForDetail {
    public static void main(String[] args) {

        /*for(; 1 ;){
            //1) 循环条件是返回一个布尔值的表达式
        }*/
        int counter = 1;
        for (; counter <= 5 ;){
            //2) for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
            System.out.println("现在循环了第" + counter++ + "遍");
        }
        //3) 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代
        //语句，中间用逗号隔开
        for (int i=1,j=2;i<j;i++,j+=2){
            System.out.println("i=" + i + "j=" + j);
        }
         for(;;){
                    //这是一个死循环
                }
    }
}
