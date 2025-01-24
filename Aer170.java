package aer170;

import java.util.Scanner;

public class Aer170 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		while (true) {
			
			int piedras = Integer.valueOf(in.next());
			if (piedras == 0) {
				break;
			}
			
			int lado = 0;
			for(int i = 1; i<=piedras; i++) {
				if(piedras-i >=0) {
					lado=i;
					piedras-=i;
				}
			}
			
			System.out.println(lado + " " + piedras);

		}

	}

}
