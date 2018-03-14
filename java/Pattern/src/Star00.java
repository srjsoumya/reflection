import java.util.*;

public class Star00 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = scr.nextInt();
		int i, j;
		for (i = 1; i <= no; i++) {
			for (j = no; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				if (i == no && j == no)
					System.out.println(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = no - 1; i >= 1; i--) {
			for (j = 0; j <= no - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scr.close();
	}
}
