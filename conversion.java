import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double Tcelsius = sc.nextDouble();
        double Tfahrenheit = (Tcelsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + Tfahrenheit);
    }
}
