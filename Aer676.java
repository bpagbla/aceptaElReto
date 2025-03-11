package aer676;

import java.util.Scanner;

public class Aer676 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int casos = in.nextInt();

		for (int i = 0; i < casos; i++) {
			int a1 = in.nextInt();
			int a2 = in.nextInt();
			int bisiestos = 0;
			int nobis = 0;

			for(int j = a1; j<=a2; j++) {
				if(esbisiesto(j)) {
					bisiestos++;
				}
			}
			
			nobis = a2-a1+1 - bisiestos;

			System.out.println(nobis + " " + bisiestos);

		}
	}

	private static boolean esbisiesto(int j) {
		// TODO Auto-generated method stub
		
		return (j % 4 == 0 && j % 100 != 0) || (j % 400 == 0);
	}

}
