package demo_multi_demi_array;

public class Test {
    public static void main(String[] args) {
        int[][] a = {
                {45, 6, 6, 6},
                {4, 3, 6, 7},
                {7, 76, 45, 7}
        };
        //打印二维数组
        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);      得到的是三个数组的地址
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%s,",a[i][j]);
            }
            System.out.println();
        }
    }
}

