package baekjoon;

import java.util.Scanner;

public class q01157 {
	public static void main(String[] args) {
		//백준
		Scanner s = new Scanner(System.in);

		int az[] = new int['Z' - 'A' + 1];
		String str = s.next();
		String xmp = str.toUpperCase();

		for (int i = 0; i < xmp.length(); i++) {
			az[xmp.charAt(i) - 'A']++;
		}
		
		// 최댓값을 저장할 max와 그때의 i값을 저장할 imax
		int max = az[0], imax = 0;
		for (int i = 0; i < az.length; i++) {
			if (max <= az[i]) {
				max = az[i];
				imax = i;
			}
		}
		int maxnum = 0;// 최댓값의 개수
		for (int i = 0; i < az.length; i++) {
			if (max == az[i]) {
				maxnum++;
				if (maxnum > 1) {
					System.out.println("?");
					return;
				}
			}
		}
		System.out.println((char) (imax + 'A'));

	}
}
