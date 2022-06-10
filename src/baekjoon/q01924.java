package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q01924 {
//날짜를 입력받으면 2007년 기준 무슨 요일인지 출력하는 문제
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		br.close();
		String[] s = str.split(" ");
		bw.write(solution(Integer.parseInt(s[0]),Integer.parseInt(s[1]) ));
		bw.close();
	}

	public static String solution(int m, int d) {
		//날짜합==1월1일부터 m월d일까지의 지나온 일 수의 합
		//날짜합을 구하고 요일의 순환성을 이용해 문제를 해결
		
		//날짜합을 구하기 위해 각 달의 말일을 배열로 저장
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		//1월1일이 월요일이므로 날짜합을 7로나눈 나머지가 1일 때 인덱스를 통해 "MON"이 반환되도록 요일 배열을 저장
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		//날짜합을 저장할 변수
		int sum = 0;
		
		//1월1일부터 입력받은 달(m월)에 도달하기까지 지나온 일수를 더함
		for(int i=0;i<m-1;i++) {
			sum+=month[i];
		}
		
		//n일만큼 더하여 완성
		sum+=d;
		
		//1월 1일부터 12월 31일까지 달을 구분하지 않고 연속적으로 늘어놓으면 SUN~SAT까지 7을 주기로 순환함
		//입력받은 날짜로 만든 날짜합 sum도 결국 그 순환아래 놓여있으므로 7로나눈 나머지를 배열의 인덱스로 하여 요일을 구함
		return day[sum%7];
	}
	
}
