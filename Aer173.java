package aer173;

import java.util.ArrayList;
import java.util.Scanner;

public class Aer173 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);

		while (true) {
			String partido = in.next();

			if (partido.equals("F")) {
				break;
			}

			ArrayList<String> sets = new ArrayList<>();
			int puntosA = 0;
			int puntosB = 0;
			boolean saque = true; // true = A, false = B
			boolean set = false;

			for (int i = 0; i < partido.length(); i++) {
				char punto = partido.charAt(i);

				// Ganar puntos
				if (punto == 'A' && saque) {
					puntosA++;
					set = true;
				} else if (punto == 'B' && !saque) {
					puntosB++;
					set = true;
				} // Cambiar saque
				else if (punto == 'A' && !saque) {
					saque = true; // Cambio de saque
					set = true;
				} else if (punto == 'B' && saque) {
					saque = false; // Cambio de saque
					set = true;
				}

				// Verificar si alguien gana un set
				if (puntosA >= 9 && puntosA - puntosB >= 2) {
					sets.add(puntosA + "-" + puntosB);
					puntosA = 0;
					puntosB = 0;
					saque = true; // A comienza sacando el próximo set
					set = false;
				} else if (puntosB >= 9 && puntosB - puntosA >= 2) {
					sets.add(puntosA + "-" + puntosB);
					puntosA = 0;
					puntosB = 0;
					saque = false; // B comienza sacando el próximo set
					set = false; // se termina el set
				}
			}

			// Imprimir resultado
			for (int i = 0; i < sets.size(); i++) {
				if (i > 0)
					System.out.print(" ");
				System.out.print(sets.get(i));
			}

			// Agregar set incompleto y salto de linea

			if (!sets.isEmpty() && set) {
				System.out.print(" ");
				System.out.println(puntosA + "-" + puntosB);
			}else if(set) {
				System.out.println(puntosA + "-" + puntosB);
			}
			else {
				System.out.println();
			}
		}

	}
}
