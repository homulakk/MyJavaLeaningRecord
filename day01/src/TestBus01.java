public class TestBus01 {
    public static void main(String[] args) {
//        1.创建一个小盒子，追踪记录公交车上乘客变化
//        2.变量规范   首单词小写后面单词大写
         int peopleCount = 0;   //声明变量并赋值

//         3.过一站，上一个人
        peopleCount = peopleCount + 1;

//        4.上来3人，下来1人
        peopleCount = peopleCount + 3;
        peopleCount = peopleCount -1;

//        上2，下2
        peopleCount = peopleCount +2;
        peopleCount = peopleCount -2;

//        输出
        System.out.println(peopleCount);
    }
}
