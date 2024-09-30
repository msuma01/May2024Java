package session7;

public class DoWhileLoop {

	public static void main(String[] args) {
		// 1 to 10
		int i = 1;
		do {
			i++;
			System.out.println(" the value of i is " + i);
			if (i == 7) {
				System.out.println("hello");
			}
//			break;
		} while (i <= 10);
		// Usecases:
		// 1.Wait for the Element

		int p = 10;
		do {
			System.out.println(p);
			p--;
		} while (p >= 0);
		// break; break shoud be written with in the loop
// even numbers
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}

		}
// odd numbers
		
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 1) {
				System.out.println(k);
			}
		}
		// odd numbers
		for(int e=1;e<=10;e=e+2) {
			System.out.println(e);
		}
		for(int e=1;e<=10;e++) {
			System.out.println(e);
			e++;
		}


	}

}
