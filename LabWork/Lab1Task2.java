import java.util.Scanner;

public class Lab1Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, k;
		System.out.println("Enter First Number: ");
		num1 = input.nextInt();
		System.out.printf("Enter Second Number: ");
		num2 = input.nextInt();
		k = num2 % num1;
		if (k == 0) {
			System.out.println(num1 + " is a multiple of " + num2);
		} else {
			System.out.println(num1 + " is not a multiple of " + num2);
		}
		input.close();
	}
}