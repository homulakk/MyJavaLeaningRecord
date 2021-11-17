package demo01_construct;

public class Person {
        String name;
        int eyeCount;
        int mouth;

        //构造方法是new对象的时候，自动执行的方法
        //构造方法的名称和类名一致
        //构造方法没有返回值（没有返回值和返回值是void是两个概念）
    public Person(){
        System.out.println("我是构造方法");
        eyeCount = 2;
        mouth = 1;
    }

    public void helloWorld(){
        System.out.println("呜呜呜呜");
    }
}
