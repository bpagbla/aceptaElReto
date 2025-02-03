package aer464;

import java.util.Arrays;
import java.util.Scanner;

public class Aer464 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		while (in.hasNext()) {

			int corredores = in.nextInt();
			int[] tiemposOrd = new int[corredores];
			int[] tiemposSeg = new int[corredores];

			for (int i = 0; i < corredores; i++) {
				String tiempo = in.next();
				tiemposSeg[i] = Integer.parseInt(tiempo.substring(0, 2)) * 3600
						+ Integer.parseInt(tiempo.substring(3, 5)) * 60
						+ Integer.parseInt(tiempo.substring(6, tiempo.length()));
				tiemposOrd[i] = tiemposSeg[i];
			}

			Arrays.sort(tiemposSeg);
			int[] posiciones = new int[corredores];
			
			int peloton = 1;
			int puesto = 1;
			
			for (int j = 0; j < corredores; j++) {
					if(tiemposSeg[0]==tiemposOrd[j]) {
						posiciones[j]=peloton;
						tiemposOrd[j]=0;
						break;
					}
				}

			for (int i = 1; i < corredores; i++) {
				
				if (tiemposSeg[i] - tiemposSeg[i - 1] <= 1) {
					
					puesto++;
					for (int j = 0; j < corredores; j++) {
						if(tiemposSeg[i]==tiemposOrd[j]) {
							posiciones[j]=peloton;
							tiemposOrd[j]=0;
							break;
						}
					}
				} else {
					
					puesto++;
					peloton=puesto;
					
					for (int j = 0; j < corredores; j++) {
						if(tiemposSeg[i]==tiemposOrd[j]) {
							posiciones[j]=puesto;
							tiemposOrd[j]=0;
							break;
						}
					}
				}

				
			}
			
			for(int i = 0; i<corredores; i++) {
				System.out.println(posiciones[i]);
			}

			System.out.println("---");

		}
	}
}
