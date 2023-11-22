public class homework5 {
    public static void main(String[] args) {
        //输出1-100之间不能被5整除的数，每五个一行
        int counter = 0;
        for(int i = 1; i <= 100 ; i++){
            if(i % 5 != 0){
                counter++;
                System.out.print(i + "\t");
                if(counter%5 == 0){
                    System.out.print('\n');
                }
            }
        }
    }
}
