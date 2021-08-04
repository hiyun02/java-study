package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q13458 {

	public static long solution(int[] Class, int B, int C) {
		long answer=0;
		int n=Class.length;
		//교실수만큼반복문
		for(int i=0;i<n;i++) {
			//무조건 총감독관은 1명씩만 투입
			int stu=Class[i]-B;
			answer++;
			
			//감시할 학생이 남아 있으면 부감독관 투입 
			if(stu>0) {
				if(stu%C==0) answer+=(stu/C);
				//남은학생수가 부감독관의 관리가능인원으로 나누어떨어지지 않으면 1명 더 투입
				else answer+=(stu/C)+1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] student = br.readLine().split(" ");
		String[] viewer = br.readLine().split(" ");
		br.close();
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(student[i]);
		}
		bw.write(Long.toString(solution(arr, Integer.parseInt(viewer[0]), Integer.parseInt(viewer[1]))));
		bw.close();
	}
	
}
