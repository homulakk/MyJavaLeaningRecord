package practise_generatesequence;

public class GenerateSequence {
    public static void main(String[] args) {
        int num = 9;
        generateSequence(num);
    }

    /**
     * 生成一个1 2 2 3 3 3 4 4 4 4...的序列
     *
     * @param num 元素的种数
     */
    public static void generateSequence(int num) {
        int count = 0;          //添加一个计数器
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i);
                count++;
                if (count == num) {
                    return;
                }
            }
        }
    }
}
