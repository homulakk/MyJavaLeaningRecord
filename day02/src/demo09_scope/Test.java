package demo09_scope;

public class Test {
    static double carSpeed = 80;//定义全局变量


    public static void main(String[] args) {
        boolean isLightGreen = true;

        if (isLightGreen){
//            double carSpeed = 80;
            System.out.println("go ahead");
            System.out.println("车速是"+carSpeed);
        }
    }
} 
