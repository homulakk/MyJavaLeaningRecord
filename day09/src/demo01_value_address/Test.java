package demo01_value_address;

public class Test {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a);      //直接打印值，值类型

        String[] b = {"FJD","FDS","FIII"};
        System.out.println(b);      //打印出来是地址，引用类型

        Person c = new Person("c");
        System.out.println(c);  //直接打印是地址，这是使用toString方法后
    }
}
