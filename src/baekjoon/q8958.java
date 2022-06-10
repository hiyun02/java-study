package baekjoon;

import java.util.Scanner;

public class q8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("ÃÑÁ¡ : ");
		
		for (int i = 0; i < n; i++) {
			String str = s.next();
			System.out.println("ÃÑÁ¡ : " + check(str));
		}

	}

	public static int check(String string) {
		int answer = 0;
		int score = 0;
		for (int i = 0; i < string.length(); i++) {
			System.out.println("answer : " + answer + " i°ª : " + i);

			if (string.charAt(i) == 'O') {
				score++;
				answer += score;
				System.out.println("answer : " + answer);
			} else {
				score = 0;
				System.out.println("answer : " + answer);
			}
		}

		return answer;
	}

}
