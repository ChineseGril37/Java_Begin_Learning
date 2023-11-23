public class elevenDay_breakDetail {
    public static void main(String[] args){
        /*
        1)break语句可以指定退出哪一层
        2)label1是标签，由程序员指定。
        3)break后指定到哪个label就退出到哪里
        4)在实际开发中，尽量不要使用标签
        5)如果没有指定break，默认退出最近的循环体
         */
        int counter = 0;
        label1:
        for (int i = 0; i < 5; i++){
            label2:
            for (int j = 0; j < 4; j++){
                label3:
                for (int k = 0; k < 3; k++){
                    counter++;
                    System.out.println("i=" + i);
                    System.out.println("j=" + j);
                    System.out.println("k=" + k);
                    System.out.println("————————————————————————");
                    if(j == 2){
                        break label1;
                    }
                }
            }
        }
        System.out.println("counter=" + counter);
    }
}
