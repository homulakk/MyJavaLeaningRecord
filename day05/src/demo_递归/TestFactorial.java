package demo_递归;

public class TestFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int N) {
        if (N == 1 || N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}


