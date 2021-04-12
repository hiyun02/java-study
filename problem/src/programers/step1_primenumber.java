package programers;

import java.util.Scanner;

public class step1_primenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		first: for (int i = 2; i <= n; i++) {
			int root = (int) Math.sqrt((double) i);
			for (int j = 2; j < root + 1; j++) {
				if (i % j == 0) {
					continue first;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
