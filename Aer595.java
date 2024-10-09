package aer595;
import java.util.*;

public class Aer595 {

  static Scanner in;

  public static void casoDePrueba() {

   		int caso = in.nextInt();
		System.out.println(caso/100);

  } 

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } 

} 