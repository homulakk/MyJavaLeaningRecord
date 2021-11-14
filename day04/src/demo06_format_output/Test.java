package demo06_format_output;

/**
 *介绍新的API，printf
 */

public class Test {
    public static void main(String[] args) {
        String address = "中国银行";
        System.out.printf("妈妈带我去%s玩，首先映入眼帘的是%s%d个金光闪闪的大字", address, address, address.length());
    }
}