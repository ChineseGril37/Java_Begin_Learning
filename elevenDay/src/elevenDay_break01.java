public class elevenDay_break01 {
    public static void main(String[] args){
        for(int i = 0 ; i < 10 ; i++){
            if(i == 3){
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("退出for循环继续执行...");
    }
}
