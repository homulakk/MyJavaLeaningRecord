package practise_rollDice;

public class Test {
    public static void main(String[] args) {
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice());   //ctrl+D复制该行
    }
    //实现色子
    public static int rollDice(){
        int result = (int)(Math.random()*6)+1;  //[0.0-0.9999999999]*7 [0.0-6.9999]
        return result;

    }
}
