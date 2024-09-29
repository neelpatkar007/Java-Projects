
public class Lab2Task2 {

	public static void main(String[] args) {
		int number = 1;
		int count = 0;
		
		while(true) {
			if (number % 2 == 0) {
				System.out.println(number);
				count++;
				if (count == 5) {
					break;
				}
			}			
			number++;
		}
	}
}