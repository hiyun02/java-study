package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q01193 {
//주어진 분수(1/1, 1/2, 2/1, ...)의 패턴을 통해 X번째 분수를 찾는 문제

	//문제해결 함수
	public static String solution(int X) {
		//분수들의 분모분자 합이 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, ... 의 수열 형태를 띄고있음을 이용
	    //2가 1개, 3이 2개, 4가 3개, 5가 4개, ... 의 양상을 띈다.
		int i=0; int sum=0;
		while(sum<X) {
			i++;
			sum+=i;
		}
		//while문 종료 시점의 'i값(총 더한 횟수)'은 X번째 분수의 분모분자 합이 해당 수열에 '몇 개 존재하는 지'에 대한 값임
		//'분모분자합이 동일한 수들 중에서 X번째 분수는 몇번째인 지' 알기 위해 while문 종료시점의 sum과 X의 차를 i에서 뺌
		int idx = i-(sum-X);
		//지정형식대로 문자열을 돌려주기 위한 스트링빌더 선언
		StringBuilder sb = new StringBuilder();
		//i+1이 X번째 분수의 분모분자 합임. 그 합이 홀이면 분자가 오름차순이고, 짝이면 내림차순임. 그에 맞게 분모의 값도 정해짐.
		if(++i%2==0) {
			sb.append(i-idx);
			sb.append("/");
			sb.append(idx);
		}
		else {
			sb.append(idx);
			sb.append("/");
			sb.append(i-idx);
		}
		return sb.toString();
	}
	
	//예제 출력
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		br.close();
		bw.write(solution(X));
		bw.close();
		
	}

}
