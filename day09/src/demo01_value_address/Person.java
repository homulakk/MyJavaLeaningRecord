package demo01_value_address;

public class Person {
    String name;

    public Person(String name){

    }


    //toString方法直接在类里使用
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';


    }
}
