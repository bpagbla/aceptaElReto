package aer255;

import java.util.Arrays;
import java.util.Scanner;

public class Aer255 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		while (in.hasNext()) {

			char palabra[] = in.next().toCharArray();
			int palindromo = 0;

			// palindromos impares
			for (int i = 1; i < palabra.length - 1; i++) {
				int dist = 1;
				while (i + dist < palabra.length && i - dist >= 0 && palabra[i + dist] == palabra[i - dist]) {
					dist++;
				}

				int temp = 1;
				if (dist != 1) {
					dist--;
					temp = (i + dist) - (i - dist) + 1;
				}

				if (temp > palindromo) {
					palindromo = temp;
				}
			}

			// pares
			for (int i = 0; i < palabra.length; i++) {
				int dist = 1;
				int temp = 1;
				if (i + dist < palabra.length && palabra[i + dist] == palabra[i]) {
					temp = 2;
					while (i +1+ dist < palabra.length && i - dist >= 0 && palabra[i + 1 + dist] == palabra[i - dist]) {
						dist++;
					}

				}

				if (dist != 1) {
					temp = (i + dist) - (i - dist);
				}

				if (temp > palindromo) {
					palindromo = temp;
				}
			}

			System.out.println(palindromo);
		}

	}

}
