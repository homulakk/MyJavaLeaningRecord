package demo01_array_append;

public class Test {
    public static void main(String[] args) {
        String[] originName = {"小刘", "小王", "小张", "小一", "小二"};
        String[] newName = {"250", "654"};
        String[] mergedName = addAnElement(originName, newName);
        for (String i : mergedName) {
            System.out.println(i);
        }
    }

    /**
     * 数组合并
     * @param srcNames 原数组
     * @param newName  新数组
     * @return 合并后数组
     */
    public static String[] addAnElement(String[] srcNames, String[] newName) {
        //创建一个新数组,长度是两个数组长度之和
        String[] mergedNames;
        mergedNames = new String[srcNames.length + newName.length];
        //原数组放进去
        for (int i = 0; i < srcNames.length; i++) {
            mergedNames[i] = srcNames[i];
        }
        //把新数组放进去,注意新旧数组对应传递，相隔长度就是原数组长度
        //说的有点抽象，用上面定义的数组举例，需要把新数组第一个值传给原数组第六个
        //mergedName[5] = newName[0]
        for (int i = srcNames.length; i < srcNames.length + newName.length; i++) {
            mergedNames[i] = newName[i - srcNames.length];
        }
        return mergedNames;
    }
}
