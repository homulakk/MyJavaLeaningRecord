package demo_for_practise;

public class Test {
    public static void main(String[] args) {
        method3();
    }

    public static void method1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void method2() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void method3() {
        for (int i = 7; i < 78; i += 7) {
            System.out.println(i);
        }
    }

    //打印2，5，8，11，14，17，20


}


