package aer458;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		int cant = in.nextInt();

		while (cant != 0) {
			long numeros[] = new long[cant];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = in.nextLong();
			}
			Arrays.sort(numeros);

			long multiplicacionAlta = Math.max(numeros[0] * numeros[1], numeros[numeros.length - 1] * numeros[numeros.length - 2]);

			System.out.println(multiplicacionAlta);
			cant = in.nextInt();
		}

	}

}
