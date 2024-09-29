import java.util.Scanner;

public class Lab3Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter side a (-1 to exit): ");
            double a = scanner.nextDouble();

            if (a == -1) {
                System.out.println("Bye");
                break;
            }

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            if (isValid(a, b, c)) {
                System.out.println("Valid triangle.");
                System.out.println("Area: " + area(a, b, c));
                System.out.println("Perimeter: " + perimeter(a, b, c));
            } else {
                System.out.println("Invalid input. The sides do not form a valid triangle.");
            }
        }

        scanner.close();
    }

    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}
