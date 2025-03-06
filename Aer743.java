package aer743;

import java.util.Scanner;

public class Aer743 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int documentos = in.nextInt();
		
		while(documentos!=0) {
			int res = 0;
			for (int i = 0; i<documentos; i++) {
				int pag = in.nextInt();
				res+=pag/2;
			}
			System.out.println(res);
			documentos = in.nextInt();
		}
		
	}

}
