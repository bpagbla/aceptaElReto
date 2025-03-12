package aer680;

import java.util.Scanner;

public class Aer680 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int casos = in.nextInt();

		for (int i = 0; i < casos; i++) {
			int lon = in.nextInt();
			int avan = in.nextInt();
			int retr = in.nextInt();
			if (avan <= retr && avan < lon) {
				System.out.println("IMPOSIBLE");
			}

			else {
				int ciclos = 1;
				int pos = avan;

				while (pos < lon) {
					pos = pos - retr + avan;
					ciclos++;
				}

				System.out.println(ciclos);
			}
		}
	}

}

// 2 10 5 2 10 5 4
