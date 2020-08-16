import java.util.Scanner;

public class Rotacao {
	public static void main(String[] args) {

		int [][] array = new int[11][11];

		int x, y, xr = 1, yr = 1;

		Scanner s = new Scanner(System.in);

		System.out.println("Insert x and y values: ");

		x = s.nextInt();
		y = s.nextInt();

		System.out.println(x + " , " + y);
		System.out.println();

		for(int l = 0; l < array.length; l++) {
			for(int c = 0; c < array.length; c++) {
				if(l == Math.round(x) && c <= Math.round(y)) {
						array[c][l] = 1;
				}
			}
		}

		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int l = 0; l < array.length; l++) {
			for (int c = 0; c < array[l].length; c++) {
				System.out.print(array[l][c] + " ");
			}

			System.out.println(" <" + l + ">");
			System.out.println();
		}

		System.out.println("30, 45, 60 or 90 degrees");

		int dg= s.nextInt();
		double sen = 0, cos = 0;

		if(dg == 30) {
			sen = 0.5;
			cos = 1.22;
		}if(dg == 45) {
			sen = 1;
			cos = 1;
		}if(dg == 60) {
			sen = 1.22;
			cos = 0.5;
		}if(dg == 90) {
			sen = 1;
			cos = 0;
		}

		x = (int) (((x-xr)*cos) - ((y-yr)*sen));
		y = (int) (((y-yr)*cos) + ((x-xr)*sen));

		System.out.println(x + " , " + y);
		System.out.println();


		for(int l = 0; l < array.length; l++) {
			for(int c = 0; c < array.length; c++) {
				if(l == Math.round(x) && c <= Math.round(y)) {
						array[c][l] = 1;

				}
			}
		}

		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int l = 0; l < array.length; l++) {
			for (int c = 0; c < array[l].length; c++) {
				System.out.print(array[l][c] + " ");
			}

			System.out.println(" <" + l + ">");
			System.out.println();
		}
	}
}
