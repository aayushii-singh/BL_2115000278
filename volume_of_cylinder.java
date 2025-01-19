import java.util.Scanner;
public class volume_of_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the r");
        double r = sc.nextDouble();
        System.out.print("Enter the h ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder: " + volume);
    }
}