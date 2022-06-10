package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q01032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		bw.write(solution(arr));
		bw.close();
		br.close();

	}

	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();

		// 반복문 실행 중 판단할 조건의 참거짓을 저장할 논리형 변수 선언
		boolean b1;
		boolean b2;

		// 배열 속 모든 문자열의 길이, 도출할 패턴의 길이는 동일함
		int n = arr[0].length();

		// n번만큼, n개의 문자들을 순서대로 검사하는 반복문
		for (int i = 0; i < n; i++) {

			b1 = true;
			b2 = true;

			// 각 문자열들의 같은 자리 문자가 동일한 지 검사하는 반복문. 하나라도 일치하지 않으면 b1에 false가 대입
			char ch = arr[0].charAt(i);
			for (String k : arr) {
				if (k.charAt(i) != ch)
					b1 = false;
			}

			// 같은 자리 문자끼리 모두 동일할 때 해당 문자를 append
			if (b1) {
					sb.append(ch);
			}
			// 같은 자리 문자끼리 동일하지 않으면 "?"를 append
			else {
				sb.append("?");
			}
		}
		// n번 append를 마친 후 리턴
		return sb.toString();
	}
}
