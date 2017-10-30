import java.util.Arrays;
import java.util.Scanner;

public class Stooge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] array = sc.nextLine().split(" ");

		stoogeSort(array, 0, array.length - 1);

		System.out.println(retornaString(array).trim());
	}

	public static void stoogeSort(String[] array, int init, int end) {

		if (Integer.parseInt(array[end]) < Integer.parseInt(array[init])) {

			change(array, init, end);

		}

		if (end - init > 1) {

			int var = (end - init + 1) / 3;
			stoogeSort(array, init, end - var);
			stoogeSort(array, init + var, end);
			stoogeSort(array, init, end - var);
		}
	}

	public static void change(String[] array, int pos1, int pos2) {

		String temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;

	}
	public static String retornaString(String[] array) {

		String out = "";
		for (int k = 0; k < array.length; k++) {

			out += array[k] + " ";
		}
		return out;

	}
}
