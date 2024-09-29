import java.util.Scanner;

public class Lab2Task6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n, m;

		System.out.println("Enter array1 size");
		n = input.nextInt();

		System.out.println("Enter array2 size");
		m = input.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Enter the first array elements: ");
			arr1[i] = input.nextInt();
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Enter the second array elements: ");
			arr2[i] = input.nextInt();
		}

		int merge[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i = i + 1) {
			merge[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i = i + 1) {
			merge[arr1.length + i] = arr2[i];
		}
		System.out.println("The resulted array is :");
		for (int i = 0; i < merge.length; i = i + 1) {
			System.out.print(merge[i] + " ");
		}

	}

}
