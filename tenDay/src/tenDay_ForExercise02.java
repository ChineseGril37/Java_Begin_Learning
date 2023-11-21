public class tenDay_ForExercise02 {
    public static void main(String[] args) {
        /*
        2) 完成下面的表达式输出 [老师评讲 ForExercise02.java]
        0 + 5 = 5
        1 + 4 = 5
        2 + 3 = 5
        3 + 2 = 5
        4 + 1 = 5
        0 + 5 = 5
        */
        for(int i=0,j=5;i <= j;i++){
            System.out.println(i + "+" + (j-i) + "=" + j);
        }
    }
}
