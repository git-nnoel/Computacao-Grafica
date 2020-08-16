import java.util.Scanner;

public class Escala {

	public static void main(String[] args) {
		int [][] array = new int[11][11];

		int x, y, sx, sy;

		Scanner s = new Scanner(System.in);

		System.out.println("Insert X and Y values");

		x = s.nextInt();
		y = s.nextInt();

		System.out.println(x + " , " + y);
		System.out.println();

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == Math.round(x) && j <= Math.round(y)) {
						array[j][i] = 1;

				}
			}
		}

		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println(" <" + i + ">");
			System.out.println();
		}

		System.out.println("Insert Tx and Ty values?");

		sx = s.nextInt();
		sy = s.nextInt();

		x = x * sx;
		y = y * sy;

		System.out.println(x + " , " + y);
		System.out.println();


		for(int i = 0; i < array.array; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == Math.round(x) && j <= Math.round(y)) {
						array[j][i] = 1;

				}
			}
		}

		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println(" <" + i + ">");
			System.out.println();
		}

	}

}
