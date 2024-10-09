package aer117;

import java.util.Scanner;

public class main {
	static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		int cant = in.nextInt();
		for(int i = 0; i<cant; i++) {
			in.next();
			String nombre = in.next();
			System.out.println("Hola, " + nombre + ".");
		}
	}
}
