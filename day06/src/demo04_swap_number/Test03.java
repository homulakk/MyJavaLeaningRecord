package demo04_swap_number;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {4,6};
        swap(arr);      //这里arr调用函数时，将地址传递，堆（heap）中数据被改变
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void swap(int[] arr){
        int c;
        c = arr[0];
        arr[0] = arr [1];
        arr[1] = c;
    }
}
