package demo04_method_practise;

public class Test02 {
    public static void main(String[] args) {
        int age = 10;
        if (checkAge(age)) {
            System.out.println("欢迎入内");
        } else {
            System.out.println("未成年不得入内");
        }
    }

    public static boolean checkAge(int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }
}
