package demo03_kingoffight;

/**
 * Person类中要有两个方法，
 * 1.构造方法 初始化name和gender，roll一个face
 * 2.attack方法，有攻击描述和血量变化
 */
public class Person {
    String name;
    String face;
    char gender;
    int blood;
    String[] someFace ={"1","2","3","4","5"};

        //构造方法 初始化name,gender和blood，roll一个face
    public Person(String name,char gender){
        this.name = name;       //
        this.gender = gender;
        if (gender == '男'){
            blood = 110;
        }else if (gender == '女'){
            blood = 100;
        }else {
            blood = 0;
            System.out.println("薛定谔的性别");
        }
        this.face = someFace[(int)(Math.random()*5)];
        System.out.println(face);
    }

        //有攻击描述和血量变化
    public void attack(Person p){
        System.out.println(name+"给了"+p.name+"一拳");
        p.blood -= 34;
        System.out.println(name+" "+blood+" "+p.name+" "+p.blood);
    }



}

