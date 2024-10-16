package aer739;

import java.util.*;

public class Aer739 {

	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		int casos = in.nextInt();
		
		for (int i = 0; i<casos; i++) {
			int anchoP = Integer.valueOf(in.next());
			int altoP = Integer.valueOf(in.next());
			int anchoA = Integer.valueOf(in.next());
			int altoA = Integer.valueOf(in.next());
			
			//comprobar azulejos para anchoP
			int azAncho1 = (anchoP + (anchoA-1))/ anchoA; //azulejos en horizontal
			int azAlto1 = (anchoP + (altoA-1))/ altoA; //azulejos en vertical
			
			//comprobar azulejos para altoP
			int azAncho2 = (altoP + (anchoA-1))/ anchoA; //azulejos en horizontal
			int azAlto2 = (altoP + (altoA-1))/ altoA; //azulejos en vertical

			
			int numAzulejos = Math.min(azAncho1*azAlto2, azAlto1*azAncho2);
			System.out.println(numAzulejos);
			
		}

	}

}
