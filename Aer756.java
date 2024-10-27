package aer756;

import java.util.Scanner;

public class Aer756 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);
		while (in.hasNext()) {
			int num[] = new int[16];

			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.valueOf(in.next());
			}
			int cont = 0;
			for (int i = num.length - 1; i > 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (num[i] < num[j]) {
						cont++;
					}
				}
			}
			if (cont % 2 == 0) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

}
