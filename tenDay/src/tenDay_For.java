public class tenDay_For {
    public static void main(String[] args) {
        //打印10句"Hello World!"
        //传统派:
        /*System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");*/
        //维新派:
        int counter = 0;
        System.out.println("循环开始时counter的值:" + counter);
        for (counter = 1; counter <= 10; counter++){
            //进行内存分析了解counter变化
            System.out.println("语句开始时counter的值:" + counter);
            System.out.println("Hello world!");
            System.out.println("语句结束时counter的值:" + counter);
        }
    }
}