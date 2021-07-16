package baekjoon;

import java.util.Scanner;

public class q02675 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			String str = s.next();
			for (int k = 0; k < str.length(); k++) {
				for (int j = 0; j < n; j++) {
					
					System.out.print(str.charAt(k));
				}
			}
		System.out.println();}
	}

}
