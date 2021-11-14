package demo03_calculater;

/**
 * 这是计算器的类
 */
public class Calculater {
    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println("3+5=" +result);
    }

    //计算器的功能 加减乘除
    public static int add(int x, int y) {

        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int muti(int x, int y) {
        return x * y;
    }

    public static int devide(int x, int y) {

        return x / y;
    }
}
