package demo01_construct;

public class Rectangle {
    int width;
    int higth;

    /**
     * 长方形的构造方法
     * @param w 长
     * @param h 宽
     */
    public Rectangle(int w, int h) {
        width = w;
        higth = h;
        System.out.println("我是长方形的构造方法");
    }

    /**
     * 获得长方形面积
     * @return 面积
     */
    public int getArea() {
        return width * higth;
    }
}
