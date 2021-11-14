package practise_method;

public class Test {
    public static void main(String[] args) {
        int num = 4;
        if (isOdd(num)) {
            System.out.println("是偶数");
        } else {
            System.out.println("不是偶数");
        }
    }

    /**
     * 判断一个数是否是偶数
     * @param num 被判断的数
     * @return true 偶数 false 奇数
     */
    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

