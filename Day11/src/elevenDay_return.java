public class elevenDay_return {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            if(i == 3){
                System.out.println("检查点" + i);
                return;//continue;//break;
            }
            System.out.println("检查检查点");
        }
        System.out.println("检查检查检查点");
    }
}
