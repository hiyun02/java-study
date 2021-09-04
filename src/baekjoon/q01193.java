package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q01193 {
//주어진 분수(1/1, 1/2, 2/1, ...)들의 규칙을 보고 X번째 분수를 찾는 문제

	//문제해결 함수
	public static String solution(int n) {
		
		return null;
	}
	
	//예제 출력
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		bw.write(solution(n));
		bw.close();
		
	}

}
