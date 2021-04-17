package baekjoon;

import java.util.Scanner;

public class q02444 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 1; i < 2 * n ; i++) {
			if (i < n + 1) {
				for (int j = 0; j < n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("*");
				}
			
			}
			else {
				for(int j=0;j<i-n;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<2*(2*n-i)-1;j++) {
					System.out.print("*");
				}
			}
		System.out.println();
		}
	}

}
