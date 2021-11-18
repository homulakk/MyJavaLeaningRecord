package demo01_value_address;

public class ClassicInterviewQuestion {
    public static void main(String[] args) {

        int i = 3;
        int j = 6;
        int k = 3;
        System.out.println(i == j); //false
        System.out.println(i == k); //true

        /**
         *bigi,k,l,m,n地址全都相同
         *  Integer在-128——127之间有缓存
         */
        Integer bigi = 3;
        Integer bigj = 4;
        Integer bigk = 3;
        Integer bigl = 3;
        Integer bigm = 3;
        Integer bign = 3;
        Integer bigo = 3;
        System.out.println(bigi == bigj);   //false
        System.out.println(bigi == bigk);   //true
        System.out.println(bigi == bigl);   //true
        System.out.println(bigi == bigm);   //true
        System.out.println(bigi == bign);   //true
        System.out.println(bigi == bigo);   //true

        Integer bigbigi = 400;
        Integer bigbigj = 500;
        Integer bigbigk = 400;
        System.out.println(bigbigi == bigbigj); //false
        System.out.println(bigbigi == bigbigk); //false
    }
}
