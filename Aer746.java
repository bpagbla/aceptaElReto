package aer746;

import java.util.Arrays;
import java.util.Scanner;

public class Aer746 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		int guirn[] = new int[in.nextInt()];
		int lon = in.nextInt();
		while (guirn.length != 0 && lon != 0) {
			for (int i = 0; i < guirn.length; i++) {
				guirn[i] = in.nextInt();
			}
			
			Arrays.sort(guirn);
			int pos = 0;
			
			int prin = 0;
			int fin = guirn.length-1;
			
			while (prin<fin) {
				if(guirn[prin]+guirn[fin]==lon) {
					pos++;
					prin++;
					fin--;
				}else if (guirn[prin]+guirn[fin]<lon) {
					prin++;
				}else {
					fin--;
				}
			}
			
			
			System.out.println(pos);

			guirn = null;

			guirn = new int[in.nextInt()];
			lon = in.nextInt();
		}

	}

}
