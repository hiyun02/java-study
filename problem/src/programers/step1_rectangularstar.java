package programers;

import java.util.Scanner;

public class step1_rectangularstar {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		for(int i=0; i<b; i++) {
			for(int k=0; k<a; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
