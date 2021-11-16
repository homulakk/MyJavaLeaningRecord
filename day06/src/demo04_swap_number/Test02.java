package demo04_swap_number;

public class Test02 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        //交换两个数字
        swap(a,b);          //值不会变化，函数结束后栈中执行的操作全部撤回
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void swap(int a,int b){
        int c;
        c = a;
        a = b;
        b = c;
    }
}
