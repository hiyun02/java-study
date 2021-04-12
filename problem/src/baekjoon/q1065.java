package baekjoon;

import java.util.Scanner;

public class q1065 {

	public static void main(String[] args) {
		// 백준 1065 : 한수의 개수 세기
		// 1부터 입력받은 수까지 한수가 몇개가 있는지 세어 개수를 출력한다.
		// 한수 : 각 자리의 수가 서로 등차수열을 이루는 수
		Scanner s = new Scanner(System.in);
		//입력받은 수를 저장할 변수 N과 한수의 개수를 저장할 변수 N을 선언
		int N = s.nextInt();
		int result = 0;
		//1부터 입력받은 수 N까지 한수인지 아닌지를 확인하는 반복문
		for (int i = 1; i < N + 1; i++) {
			//'이 수는 한수이다'라는 명제의 참거짓을 반환하는 solution 함수가 참을 반환하면 개수+1추가
			if (solution(i))
				result++;

		}
		System.out.println(result);
	}

	static boolean solution(int n) {
		boolean answer;
		
		//100이하의 수는 무조건 한수이므로 참
		if (n < 100)
			answer = true;
		else {
			//answer에 false를 넣고 세자리 자연수갸 한수인지 확인
			answer = false;
			//a, b, c가 그 순서대로 등차수열이라면 a+c=2*b 가 성립한다.
			if ((n / 100 + n % 100 % 10) / (float) 2 == n % 100 / 10)
				answer = true; //각 자릿수가 등차수열이면 answer에 true를 저장
		}
//if문을 타지 않는다면 false가 반환된다.
		return answer;
	}

}
