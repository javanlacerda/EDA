import java.util.Arrays;
import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] array = sc.nextLine().split(" ");

		selectionSort(array, 0, searchLower(array, 0));
	}

	public static int searchLower(String[] array, int init) {

		int lower = init;
		for (int i = init + 1; i < array.length; i++) {

			if (Integer.parseInt(array[i]) < Integer.parseInt(array[lower])) {
				lower = i;
			}
		}
		return lower;
	}

	public static void selectionSort(String[] array, int fixedPos, int menor) {

		if (array[fixedPos] != array[menor]) {
			change(array, fixedPos, menor);
			System.out.println(Arrays.toString(array));
		}
		if (fixedPos + 1 < array.length && array.length > 1 && !isSorted(array)) {

			int atualMenor = searchLower(array, fixedPos + 1);
			selectionSort(array, fixedPos + 1, atualMenor);
		}
	}

	public static void change(String[] array, int pos, int posMenor) {

		String temp = array[pos];
		array[pos] = array[posMenor];
		array[posMenor] = temp;

	}

	public static boolean isSorted(String[] array) {

		boolean isSort = true;
		for (int i = 0; i < array.length - 1; i++) {

			if (Integer.parseInt(array[i + 1]) < Integer.parseInt(array[i])) {

				isSort = false;
			}
		}
		return isSort;

	}
}
