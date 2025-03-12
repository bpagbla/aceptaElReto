package aer681;

import java.util.Arrays;
import java.util.Scanner;

public class Aer681 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		while (in.hasNextInt()) {
			int colores = in.nextInt();
			int[] piezas = new int[colores];
			for (int i = 0; i < colores; i++) {
				piezas[i] = in.nextInt();
			}
			
			Arrays.sort(piezas);
			long pmax = 0;
			for (int i = colores - 1; i > 0; i--) {

				if (piezas[i - 1] >= piezas[i])
					piezas[i - 1] = piezas[i] - 1;
				if (piezas[i] > 0) {
					pmax += piezas[i];
				}
			}
			if (piezas[0] > 0) {
				pmax += piezas[0];
			}
			System.out.println(pmax);

		}
	}

}
