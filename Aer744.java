package aer744;

import java.util.Scanner;

public class Aer744 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		while (in.hasNextInt()) {
			int tiempo = in.nextInt();
			int resp = 0;
			int primerMensaje = in.nextInt();
			if (primerMensaje != 0) {
				resp++;
				int sig = in.nextInt();
				while (sig != 0) {
					if (sig - primerMensaje > tiempo) {
						resp++;
						primerMensaje = sig;
					}
					sig = in.nextInt();
				}
			}
 
			System.out.println(resp);
		}

	}

}
