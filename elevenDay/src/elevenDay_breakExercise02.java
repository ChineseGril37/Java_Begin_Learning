import java.util.Scanner;

public class elevenDay_breakExercise02 {
    public static void main(String[] args){
        //2) 实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，请使用 for+break
        String username,password;
        Scanner myScanner = new Scanner(System.in);
        for(int i = 2 ; i >= 0; i--){
            System.out.println("请输入用户名:");
            username=myScanner.next();
            System.out.println("请输入密码:");
            password=myScanner.next();
            if("丁真".equals(username) && "666".equals(password)){
                System.out.println("恭喜你，登录成功~");
                break;
            }
            System.out.println("登录机会还有" + i + "次");
        }
    }
}
