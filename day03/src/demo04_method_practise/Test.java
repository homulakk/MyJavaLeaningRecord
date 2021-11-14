package demo04_method_practise;

/**
 * 练习，函数名sayHello,返回值是String,接受一个String参数，参数名叫name
 */

public class Test {
    public static void main(String[] args) {
        String name = "一二三";
        System.out.println(sayHello(name));
    }

    //    根据姓名生成欢迎语的函数
    public static String sayHello(String name) {
        return "热烈欢迎" + name + "入住酒店";

    }
}
