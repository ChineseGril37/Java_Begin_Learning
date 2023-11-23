public class eightDay_BitOperationDetail {
    public static void main(String[] args) {
        //1. 算术右移 >> :低位一处，符号位不变，并用符号位补溢出的高位
         //1 => 00000001 => 00000000 本质1 / 2 / 2 = 0
        System.out.println("1 >> 2 => " + ( 1 >> 2 ));
         //1 => 00000001 => 00000100 本质 1 * 2 * 2 = 4
        System.out.println("1 << 2 => " + ( 1 << 2 ));
        //4 => 00000100 => 00100000
        System.out.println("4 << 3 => " + ( 4 << 3 ));
    }
}
