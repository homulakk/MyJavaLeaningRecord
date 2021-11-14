package example_multiplicationtable;

public class Test {
    public static void main(String[] args) {
        int line = 15;
        multiplicationTable(line);
    }

    //依赖两个for循环实现，i控制行，j控制列
    /**
     * 打印乘法表
     * @param line 行数，列数也相同
     */
    public static void multiplicationTable(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
