public class elevenDay_break {
    public static void main(String[] args) {
        //随机生成 1-100 的一个数，直到生成了 97 这个数，看看你一共用了几次
        //先看看Math.random()的用法
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        for (int counter = 1;;counter++){
            int temp = (int)(Math.random()*100)+1;
            System.out.println("第" + counter + "次的结果为:" + temp);
            if(temp == 97)
                break;
        }
    }
}