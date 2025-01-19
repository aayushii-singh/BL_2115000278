import java.util.Scanner;
public class AvgOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter Third Number: ");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
}
