public class Circle {

	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		int r = 10;

		while(x < y){
			int p = 1 - r;
			x++;

			if(p < 0){
				p = p + 2 * x + 1;

			}if(p >= 0){
				y--;
				p = p + 2 * x + 1 - 2 * y;
			}

			System.out.print(p + " ");
			System.out.print(x + " ");
			System.out.print(y + " ");
			System.out.print(2*x + " ");
			System.out.print(2*y + " ");
			System.out.println();

		}
	}

}
