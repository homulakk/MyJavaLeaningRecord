package demo02_print_two_demi_array;

public class Test {
    public static void main(String[] args) {
        int[][] arrs = {
                {4, 67, 764, 3, 6, 7},
                {6, 3, 2, 6, 6},
                {7, 6, 3, 8, 2, 8, 1}
        };
        normalForLoop(arrs);
        System.out.println();
        enhanceForLoop(arrs);
    }

    public static void normalForLoop(int[][] arrs) {
        //普通for循环打印二维数组
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);        //打印内存地址
            for (int j = 0; j < arrs[i].length; j++) {
                System.out.printf("%s,", arrs[i][j]);   //打印数组
            }
            System.out.println();
        }
    }

    /**
     *先定位二维数组里的每一个数组的内存，再打印每一个数组
     * @param arrs
     */
    public static void enhanceForLoop(int[][] arrs) {
        //增强for循环
        for (int[] arr : arrs) {
            System.out.println(arr);        //打印内存地址
            for (int i : arr) {
                System.out.printf("%d,", i);        //直接打印数组元素
            }
            System.out.println();
        }
    }
}
