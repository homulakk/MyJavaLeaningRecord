package demo01_enhance_for;

public class Test {
    public static void main(String[] args) {

        int[] arr = {4,6,7,7,8,3,3,3,2};
            //让冒号前面的参数遍历数组
        for (int i: arr){               //增强for循环
            System.out.println(i);
        }
            //两种方式等效
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i);
        }
    }
}
