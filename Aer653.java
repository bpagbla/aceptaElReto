package aer653;

import java.util.*;

public class Aer653 {

	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);

		while (true) {
			int hectom = in.nextInt();

			if (hectom != 0) {
				int tiempos[] = new int[hectom];
				for (int i = 0; i < hectom; i++) {
					int tiempo = in.nextInt();
					tiempos[i] = tiempo;
				}
				int sumaTiempos = 0;
				int inicio = 0;
				int meta = 0;
				for (int i = 0; i < tiempos.length - 9; i++) {
					int suma = 0;
					for (int j = 0; j < 10; j++) {
						
						suma += tiempos[i + j];
					}
					if (suma <= sumaTiempos || sumaTiempos == 0) {
						sumaTiempos = suma;
						inicio = (i) * 100;
						meta = (i + 10) * 100;
					}
				}

	            // Formatear el tiempo como minutos:segundos
	            int minutos = sumaTiempos / 60;
	            int segundos = sumaTiempos % 60;

	            // Imprimir la salida en el formato correcto
	            System.out.printf("%d-%d %d:%02d%n", inicio, meta, minutos, segundos);
			} else {
				break;
			}
		}

	}

}

//15
//10
//10
//1
//2
//1
//2
//1
//2
//1
//2
//1
//2
//10
//10
//10
//15
//10 
//10 
//1 
//1 
//1 
//1 
//1 
//1 
//1 
//1 
//1 
//1 
//1 
//1 
//10
//15
//30 
//30 
//6 
//6 
//6 
//6 
//6 
//6 
//6 
//6 
//6 
//7 
//30 
//30 
//30
//10
//5
//5
//5
//5
//5
//5
//5
//5
//5
//5
//12
//10 
//20 
//10 
//5 
//15 
//10 
//15 
//5 
//20 
//20 
//5 
//5
//0