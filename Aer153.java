package aer153;

import java.util.Scanner;

public class Aer153 {
	static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);
		Long cant = in.nextLong();
		in.nextLine();
		for(int i = 0; i<cant; i++) {
		String horaEspejo = in.nextLine();
		int minutosE = Integer.valueOf(horaEspejo.substring(3, horaEspejo.length()));
		int horasE = Integer.valueOf(horaEspejo.substring(0, 2));
		
		int minutos=60-minutosE;
		int horas = 12-horasE;
		
		//si los minutos son 60 que ponga 0 y sino que le quite una hora (todavia no ha llegado a esa hora)
		if(minutos==60) {
			minutos=0;
		}else {
			horas--;
		}
		
		//si son las 00 o sale un -1 que sume 12
		if(horas==0 || horas==-1) {
			horas+=12;
		}
		
		System.out.printf("%02d:%02d%n", horas, minutos);
		}
		
	}

}
