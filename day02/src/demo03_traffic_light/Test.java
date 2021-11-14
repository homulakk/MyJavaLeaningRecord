package demo03_traffic_light;

public class Test {
    public static void main(String[] args) {
        boolean isLightRed = true;
        boolean isLightYellow = false;
        boolean isLighyGreen = false;

        if (isLightRed){
            System.out.println("停车等待");
        }

        if (isLightYellow){
            System.out.println("减速慢行");
        }

        if (isLighyGreen){
            System.out.println("继续行驶");
        }
    }
}


