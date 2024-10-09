package aer595;
import java.util.*;

public class Solution {

  static Scanner in;

  public static void casoDePrueba() {

   		int caso = in.nextInt();
		System.out.println(caso/100);

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class Solution