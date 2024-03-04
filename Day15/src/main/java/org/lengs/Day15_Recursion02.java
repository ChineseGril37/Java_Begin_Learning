public class Day15_Recursion02 {
    public static void main(String[] args) {
        T t = new T();
        System.out.println("5的阶乘=" + t.factorial(5));
    }
}
class T{
    public int factorial(int n){
        if(n == 1){
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }
}
