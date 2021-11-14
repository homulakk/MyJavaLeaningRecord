package practise_catTrouble;

public class CatTrouble {
    public static void main(String[] args) {
        boolean isShout = true;
        int hour =8 ;

        if (catTrouble(isShout, hour)) {
            System.out.println("哇，邻居扛着刀来啦！");
        } else {
            System.out.println("你家咪咪真可爱呀");
        }
    }

    /**
     * 猫咪叫，邻居闹
     * @param isShout 猫咪在叫吗，是则true，否则false
     * @param hour 几点叫，精度为小时
     * @return true or false
     */
    public static boolean catTrouble(boolean isShout, int hour) {
        if ((hour >= 20 || hour < 7) && isShout == true) {
            return true;
        } else {
            return false;
        }
    }
}
