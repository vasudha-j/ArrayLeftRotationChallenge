import java.util.Scanner;

public class ArrayLeftRotation {

	public static int[] perofromrotationOfArrayByLeft(int[] arrayToBeRotated, int numberOfRotations) {

		int sizeOfArray = arrayToBeRotated.length;

		int[] rotatedArray = new int[sizeOfArray];
		int difference = sizeOfArray - numberOfRotations;
		System.arraycopy(arrayToBeRotated, numberOfRotations, rotatedArray, 0, difference);
		System.arraycopy(arrayToBeRotated, 0, rotatedArray, difference, numberOfRotations);

		return rotatedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray = scanner.nextInt();
		int numberOfRotations = scanner.nextInt();
		int[] arrayToBeRotated = new int[sizeOfArray];

		// Fill initial array:
		for (int i = 0; i < sizeOfArray; i++) {
			arrayToBeRotated[i] = scanner.nextInt();
		}
		scanner.close();

		// Rotate array by d elements:
		arrayToBeRotated = perofromrotationOfArrayByLeft(arrayToBeRotated, numberOfRotations);

		// Print array's elements as a single line of space-separated values:
		for (int i : arrayToBeRotated) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
