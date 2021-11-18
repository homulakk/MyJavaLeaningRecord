package demo02_tostring;

public class Person {
    String name;
    int age;

    /**
     * alt + insert(数字键盘上的0)
     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
