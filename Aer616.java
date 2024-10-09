package aer616;

import java.util.Arrays;
import java.util.Scanner;

public class Aer616 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int entrada = Integer.valueOf(in.next());

		while (entrada != 0) {
			int contDer = 0;
			int contIzq = 0;
			String picPoc[] = new String[entrada];
			for (int i = 0; i < picPoc.length; i++) {
				picPoc[i] = in.next();
			}
			
			boolean pos = true; // true va hacia la derecha, false hacia la izquierda
			
			for (int i = 0; i < picPoc.length; i++) {
				if(picPoc[i].equalsIgnoreCase("PIC")) {
					if(pos) {
						pos=false;
					}else {
						pos=true;
					}
				}
				if(picPoc[i].equalsIgnoreCase("PONG!")) {
					if(pos) {
						contIzq++;
					}else {
						contDer++;
					}
				}
			}
			System.out.println(contIzq + " " + contDer);
			entrada = Integer.valueOf(in.next());
		}

	}

}
