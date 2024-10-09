package aer677;
import java.util.Scanner;

public class Aer677 {
	static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		int cant = in.nextInt();
		for(int i = 0; i<cant; i++) {
			long num = in.nextLong();
			long preNum = num/10;
			if(preNum==0) {
				System.out.println(num*num);
			}else {
				System.out.println((preNum*(preNum+1)) +"25");
			}
			
		}
		
	}
}
