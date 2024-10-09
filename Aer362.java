package aer362;

import java.util.Scanner;

public class Aer362 {
	static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);
		Long cant = in.nextLong();
		in.nextLine();
		for(int i = 0; i<cant; i++) {
			if(in.nextLine().equals("25 12")) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
		
		
	}

}
