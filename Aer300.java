package aer300;

import java.util.Scanner;

public class Aer300 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);

		int casos = in.nextInt();

		for (int i = 0; i < casos; i++) {
			String palabra = in.next();

			if (compVocal('a', palabra) && compVocal('e', palabra) && compVocal('i', palabra) && compVocal('o', palabra)
					&& compVocal('u', palabra)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

	private static boolean compVocal(char vocal, String palabra) {
		// TODO Auto-generated method stub
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == vocal) {
				return true;
			}
		}
		return false;
	}

}
