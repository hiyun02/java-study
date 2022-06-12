package baekjoon;

import java.io.*;

public class q13458 {

	public static long solution(int[] Class, int B, int C) {
		long answer=0;
		int n=Class.length;
		//���Ǽ���ŭ�ݺ���
		for(int i=0;i<n;i++) {
			//������ �Ѱ������� 1���� ����
			int stu=Class[i]-B;
			answer++;
			
			//������ �л��� ���� ������ �ΰ����� ���� 
			if(stu>0) {
				if(stu%C==0) answer+=(stu/C);
				//�����л����� �ΰ������� ���������ο����� ����������� ������ 1�� �� ����
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
