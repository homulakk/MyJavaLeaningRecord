package practise_rollDice;

/**
 * 提供了投色子的函数
 */
public class DiceUpgrade {
    public static void main(String[] args) {
        //alt托动鼠标向下，多行编辑
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行
        System.out.println("扔色子"+rollDice(6));   //ctrl+D复制该行

    }

    /**
     * @param N 色子的面数
     * @return 色子的点数
     */
    //实现色子，生成1-N的随机数
    public static int rollDice(int N){
        int result = (int)(Math.random()*N)+1;  //[0.0-0.9999999999]*7 [0.0-6.9999]
        return result;

    }
}
