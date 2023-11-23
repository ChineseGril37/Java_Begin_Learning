public class tenDay_whileExercise {
    public static void main(String[] args){
//        1) 打印 1—100 之间所有能被 3 整除的数 [使用 while]
//        2) 打印 40—200 之间所有的偶数 [使用 while]
        System.out.println("1—100 之间所有能被 3 整除的数");
        int temple = 3;
        while (temple <= 100){
            if(temple % 3 == 0){
                System.out.println(temple);
            }
            temple++;
        }
        System.out.println("40—200 之间所有的偶数");
        temple = 40;
        while (temple <= 200){
            if(temple % 2 == 0){
                System.out.println(temple);
            }
            temple++;
        }
    }
}
