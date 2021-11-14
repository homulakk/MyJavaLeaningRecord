package practise_makeBarbell;

public class MakeBarbell {
    public static void main(String[] args) {
        System.out.println(makeBarbell(1, 1, 5));
    }

    /**
     * 做杠铃
     *
     * @param small 1kg杠铃数量
     * @param big   5kg杠铃数量
     * @param goal  目标
     * @return 是否能达到目标
     */
    public static boolean makeBarbell(int small, int big, int goal) {
        //目标太大，杠铃不够
        if ((small + big * 5) < goal) {
            return false;
        }
        if ((small + big * 5) == goal) {
            return true;
        }
        if ((small + big * 5) > goal) {
            return false;
        }else {
            return true;
        }
    }
}