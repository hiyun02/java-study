import java.util.Arrays;
import java.util.Scanner;

public class challenge3 {

	public static void main(String[] args) {
//		백준 구명보트 문제
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		int n = s.nextInt();
		int[] people = new int[n];
		for (int i = 0; i < n; i++)
			people[i] = s.nextInt();
		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {

		int answer = 0;

		Arrays.sort(people);

		for (int i = people.length - 1; i >= 0;) {
			int sum = limit - people[i];

			for (int j = 0;;) {

				if (sum >= people[j]) {
					answer++;
					j++;
					i--;
					break;
				} else {
					answer++;
					i--;
					break;
				}
			}
		}

		return answer;
	}
}
