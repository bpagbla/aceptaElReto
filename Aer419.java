package aer419;

import java.util.Arrays;
import java.util.Scanner;

public class Aer419 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int pesoMax = Integer.valueOf(in.next());
		int personas = Integer.valueOf(in.next());

		while (pesoMax != 0 && personas != 0) {
			long pesos[] = new long[personas];

			for (int i = 0; i < pesos.length; i++) {
				pesos[i] = Long.valueOf(in.next());
			}

			Arrays.sort(pesos);
			
			int contador = 0;
			int fin = 0;
			
			for(int i = pesos.length-1; i>=fin; i--) {
				if(pesos[i] + pesos[fin] <= pesoMax) {
					fin++;
				}
				contador++;
			}

			System.out.println(contador);
			pesoMax = Integer.valueOf(in.next());
			personas = Integer.valueOf(in.next());
		}

	}

}
