import java.lang.Math;
import java.util.Scanner;

public class task2 {
    public static void calculateTrigValues() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть кут в градусах: ");
        double degrees = scanner.nextDouble();


        double radians = Math.toRadians(degrees);


        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        System.out.println("Кут: " + degrees + " градусів");
        System.out.println("Синус: " + sinValue);
        System.out.println("Косинус: " + cosValue);

        scanner.close();
    }
}
