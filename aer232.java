package Aer232;

import java.util.Scanner;

public class aer232 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);
		int mesDia[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		while (true) {

			int diaNac = Integer.valueOf(in.next());
			int mesNac = Integer.valueOf(in.next());
			int anioNac = Integer.valueOf(in.next());

			int diaAct = Integer.valueOf(in.next());
			int mesAct = Integer.valueOf(in.next());
			int anioAct = Integer.valueOf(in.next());

			if (diaNac == 0) {
				break;
			}

			if (mesNac == mesAct && diaNac == diaAct) {
				System.out.println(0);
			} else {
				int noCump = 0;

				int anios = anioAct - anioNac;
				int meses = mesAct - mesNac;

				if (meses < 0) {
					anios--;
					for (int i = 0; i < mesDia.length; i++) {
						if (i < mesAct - 1 || i > mesNac - 1) {
							noCump += mesDia[i];
						}
					}
					noCump += diaAct;
					noCump += mesDia[mesNac - 1] - diaNac;
				} else if (meses == 0) {
					noCump -= diaNac-1 -diaAct;
					if(diaAct>diaNac) {
						noCump--;
					}
				} else {
					for (int i = mesNac; i < mesAct - 1; i++) {
						noCump += mesDia[i];
					}
					noCump += diaAct;
					noCump += mesDia[mesNac - 1] - diaNac;
				}

				noCump += anios * 364;

				System.out.println(noCump);
			}
		}
	}
}

//4 7 1862 24 5 1865
//23 6 1912 7 6 1954
//17 2 2014 17 2 2015
//10 6 2000 11 6 2000
//10 6 2000 11 6 2001
//10 6 2000 12 6 2001
//10 6 2000 9 6 2001
//25 5 2000 13 7 2003
//0 0 0 0 0 0