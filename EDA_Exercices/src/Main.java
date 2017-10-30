import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> enta = new ArrayList<>();

		addElement(enta);

	}

	public static boolean temRepetido(ArrayList<Integer> enta) {

                for (int s : enta) {
                        int cont = 0;

                        for (int a : enta) {

                                if (s == a) {

                                        cont += 1;

                                        if (cont > 1) {
                                                return true;
                                        }
                                }
                        }
                }
                return false;
        }
	
	  public static void addElement(ArrayList enta) {

          String str = "";
          for (int i = 1; i <= 2000; i++) {

                  enta.add(i);

                  long start = System.nanoTime();

                  temRepetido(enta);

                  long elapsed = System.nanoTime() - start;

                  str += i + "    " + elapsed + System.lineSeparator();

          }

          System.out.println(str);

  }

}
