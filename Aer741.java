package aer741;

import java.util.Scanner;

public class Aer741 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int casos = in.nextInt();

		for (int i = 0; i < casos; i++) {
			
			long pisos = in.nextLong();
			
			
			long cartas = pisos*(pisos+1) + ((pisos*(pisos+1))/2 - pisos); // gauss *2 para calcular los triangulos (sin base) + las cartas extra de las bases que también es gauss menos el ultimo numero
			
			
			System.out.println(cartas);
		}
	}
}
