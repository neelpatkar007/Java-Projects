import java.util.Scanner;

public class Lab2Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		int days;
		
		System.out.printf("Enter month number: ");
		month = scanner.nextInt();
		
		switch (month) {
		/* fill in every cases below */
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			System.out.println("Enter year (yyyy): ");
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
			}
			break;
		default:
			days = 0;
			System.out.println("error!!!");
			break;
		}
		
		if (days != 0)
			System.out.println("Number of days in " + month + " is: " + days);
		else
			System.out.println("You have entered an invalid month!!!");
	}
}