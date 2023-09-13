public class fourDay_BooleanUsage {
    public static void main(String[] args){
        //演示判断成绩是否通过的案例
        //定义一个布尔变量
        boolean isPass = true;
        if(isPass == false){
            System.out.println("考试通过！");
        } else {
            System.out.println("考试未通过！");
        }
        //省流版
        if(!isPass){
            System.out.println("考试通过！");
        } else {
            System.out.println("考试未通过！");
        }
        //细节说明
        //不可以用0或非0的整数取代false或true，这点与C语言不同
    }
}
