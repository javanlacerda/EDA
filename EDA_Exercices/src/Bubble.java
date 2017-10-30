import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] array = sc.nextLine().split(" ");

		int control = 0;
		int i = 0;
		while (i < array.length) {

			int j = 0;
			int cont = 0;
			while (j < array.length - 1 - i) {

				if (Integer.parseInt(array[j]) > Integer.parseInt(array[j + 1])) {

					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					cont++;
					control++;
				}
				j++;
			}
			if (cont == 0)
				break;

			System.out.println(retornaString(array).trim());
			i++;

		}
		if (control == 0 || array.length == 1) {

			System.out.println(retornaString(array).trim());

		}

	}

public static String retornaString(String[] array) {

		String out = "";
		for (int k = 0; k < array.length; k++) {

			out += array[k] + " ";
		}
		return out;

	}

}
