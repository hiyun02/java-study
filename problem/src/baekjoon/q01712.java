package baekjoon;

import java.util.Scanner;

public class q01712 {

	public static void main(String[] args) {
		// a가 고정비용 b가 가변비용. 총 생산비용은 a+b, 판매가격은 c 판매분기점은 몇 번째 판매일 때 오는가?
		Scanner s = new Scanner(System.in);
		long A = s.nextLong();
		long B = s.nextLong();
		long C = s.nextLong();

		if (C<=B) {
			System.out.println(-1);
		} else {
			System.out.println(A/(C-B)+1);
		}
	}

}