package practise_blackjack;

public class BlackJack {
    public static void main(String[] args) {

    }


    /**
     * BlackJack函数，判断21的输赢
     * @param a a用户点数
     * @param b b用户点数
     * @return 赢家点数
     */
    public static int BlackJack (int a,int b){
        if (a>21 && b>21){
            return 0;
        }
        if (a>21 && b<=21){
            return b;
        }
        if (a<=21 && b>21){
            return a;
        }
        return Math.max(a,b);
    }
}
