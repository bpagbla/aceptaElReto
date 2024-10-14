package aer748;

import java.util.*;

public class Aer748 {
	static HashMap<String, Integer> forajidosArmas = new HashMap<String, Integer>();
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new java.util.Scanner(System.in);

		int operaciones = in.nextInt();

		while (operaciones != 0) {
			forajidosArmas.clear();
			for (int i = 0; i < operaciones; i++) {
				String nombre = in.next();
				if (nombre.equals("?")) {
					int numFora = Integer.valueOf(in.next());
					int sumArmas = 0;
					for (int j = 0; j < numFora; j++) {
						String foraj = in.next();
						sumArmas += forajidosArmas.get(foraj);
						forajidosArmas.remove(foraj);
					}
					System.out.println(sumArmas);
				} else {
					int armas = Integer.valueOf(in.next());
					if (forajidosArmas.containsKey(nombre)) {
						forajidosArmas.put(nombre, forajidosArmas.get(nombre) + armas);
					} else {
						forajidosArmas.put(nombre, armas);
					}
				}
			}

			System.out.println("---");

			operaciones = in.nextInt();
		}

	}

}
