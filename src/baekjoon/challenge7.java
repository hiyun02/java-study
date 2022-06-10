package baekjoon;

import java.util.Scanner;

public class challenge7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int answer = 0;

		int min = s.nextInt();
		int max = s.nextInt();

		for (int i = min; i <= max; i++) {
			if (fcount(i) % 2 == 0) {
				answer++;
			}
		}

		System.out.println(answer);
	}

//약수의 개수를 세어 주는 함수
	public static int fcount(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count;
	}

}
