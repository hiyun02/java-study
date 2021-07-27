package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q02292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write(Integer.toString(solution(n)));
		bw.close();
		br.close();
	}
	public static int solution(int N) {
		//지나는 벌집의 개수. 출발지점1부터 시작
		int answer=1;
		
		//n이 1이면 1을 리턴
		if(N==1) return answer;
		
		
		//1을 기준으로 n번 이동하면 6n개의 육각형이 둘러싸고 있음을 이용해 N이 속한 범위를 통해 이동횟수를 구함
		int range=1;
		int up=1;
		while(range<N) {
			answer++;
			range+=6*up;
			//증가'폭'이 6씩 증가
			up++;
		}
		
		return answer;
	}
}
