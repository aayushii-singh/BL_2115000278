import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in Kilometers: ");
        double km = sc.nextDouble();
        double miles =km * 0.621371;
        System.out.println("Distance in Miles: " + miles);

    }
}
