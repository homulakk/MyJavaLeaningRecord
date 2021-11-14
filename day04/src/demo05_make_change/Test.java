package demo05_make_change;

public class Test {
    public static void main(String[] args) {
        double money = 5.00;
        double banana = 3.99;
        double change = makeChange(banana,money);
        System.out.println("找零："+change);
    }
    public static double makeChange(double itemCost,double money){
        return money - itemCost;

    }
}
