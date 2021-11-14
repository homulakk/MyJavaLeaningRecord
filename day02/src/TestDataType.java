public class TestDataType {
    public static void main(String[] args) {

        int d = 4;
        float pi = 3.14159f;

        System.out.println(d * pi);

        int len = (int) (d * pi);
        System.out.println(len);

        long l = 4253546464646466l;
        int b = (int) l;
        System.out.println(b);


    }
}
