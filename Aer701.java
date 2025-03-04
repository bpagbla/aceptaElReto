package aer701;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Aer701 {
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);

		int productos = in.nextInt();

		while (productos != 0) {
			int bloques = in.nextInt();

			int[][] udsCad = new int[bloques][2];

			for (int i = 0; i < bloques; i++) {
				udsCad[i][0] = in.nextInt();
				udsCad[i][1] = in.nextInt();
			}

			
			Arrays.sort(udsCad, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
                }
            });
			
			
			int total = 0;
			int dias = 0;
			for (int i =0; i<udsCad.length; i++) {
				total+=udsCad[i][0];
				dias = udsCad[i][1];
				if(total>=productos) {
					break;
				}
			}
			System.out.println(dias);
			productos = in.nextInt();
		}
	}

}
