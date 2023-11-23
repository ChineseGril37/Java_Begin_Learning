public class sixDay_LogicOperator02 {
    public static void main(String[] args){
        int age = 50;
        // ||短路或 和 |逻辑或 案例演示
        if(age > 20 || ++age < 30){
            System.out.println("ok100");
        }
        System.out.println("age = "+ age);
        //
        if(age > 20 | ++age < 30){
            System.out.println("ok200");
        }
        System.out.println("age = "+ age);
    }
}
