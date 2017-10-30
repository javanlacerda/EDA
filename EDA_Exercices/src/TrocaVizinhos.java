import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TrocaVizinhos {

	public static void main(String[] args) throws InterruptedException {

		addElement();

	}

	public static void trocaVizinhos(ArrayList<Integer> enta) {

		for (int i = 0; i < (enta.size() - 1); i += 2) {

			Integer j = enta.get(i);
			enta.set(i, enta.get(i + 1));
			enta.set(i + 1, j);

		}

	}

	public static void addElement() {

		ArrayList<Integer> enta = new ArrayList<>(99999);

		String str = "";
		for (int i = 1; i <= 2000; i++) {

			enta.add(i);

			long start = System.nanoTime();

			trocaVizinhos(enta);

			long elapsed = System.nanoTime() - start;

			str += i + "    " + elapsed + System.lineSeparator();

		}

		System.out.println(str);
	}

}
