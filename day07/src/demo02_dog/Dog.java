package demo02_dog;

public class Dog {

    //静态属性
    String name;    //名字
    String color;   //颜色
    boolean isHungry;   //饿了吗


    //动态行为

    //打招呼
    public void sayHello(){
        System.out.println("汪汪汪");
    }

    //捉耗子
    public void catchMouse(){
        System.out.println("eat mouse");
    }

}
