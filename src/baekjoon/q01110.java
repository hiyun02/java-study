package baekjoon;

import java.util.Scanner;

public class q01110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		System.out.println(solution(N));
	}

	public static int solution(int n) {

		int num = n;
		int hap, cycle = 0;

		while (true) {
			// 십의자리와 일의자리의 합을 hap에 저장
			hap = num / 10 + num % 10;
			// num의 일의자리를 십의자리로, hap의 일의자리를 일의자리로 하는 수 탄생
			num = (num % 10) * 10 + hap % 10;
			// 싸이클 1추가
			cycle++;

			// 파라미터 값과 같으면 반복문 탈출
			if (num == n)
				break;
		}
		// 그때의 싸이클 값을 반환
		return cycle;
	}

}
