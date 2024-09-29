import java.util.Scanner;

public class Lab3Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] grades = new int[20];
        int count = 0;

        System.out.println("Enter up to 20 grades. Enter any grade less than 0 to stop.");

        while (count < 20) {
            System.out.print("Enter grade #" + (count + 1) + ": ");
            int grade = scanner.nextInt();

            if (grade < 0) {
                break;
            }

            grades[count] = grade;
            count++;
        }

        double average = Average(grades);

        if (count > 0) {
            System.out.println("Average Grade: " + average);
        } else {
            System.out.println("No grades entered.");
        }

        scanner.close();
    }

    public static double Average(int[] grades) {
        if (grades.length == 0) {
            return 0; // handle the case where the array is empty
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }
}
