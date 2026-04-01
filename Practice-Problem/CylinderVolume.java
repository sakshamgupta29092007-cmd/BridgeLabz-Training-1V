import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble(), h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume = " + volume);
    }
}