import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] array = sc.nextLine().split(" ");

		insertionSort(array, 1);
	}

	public static void insertionSort(String[] array, int pos) {

		insert(array, pos);

		insertionSort(array, pos + 1);
		
		System.out.println(Arrays.toString(array));
	}

	public static void insert(String[] array, int pos) {

		if (Integer.parseInt(array[pos]) < Integer.parseInt(array[pos - 1]) && (pos - 1) >= 0) {

			String temp = array[pos];
			array[pos] = array[pos - 1];
			array[pos - 1] = temp;

			insert(array, pos - 1);

		}

	}
}
