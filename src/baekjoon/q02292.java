package baekjoon;

import java.io.*;

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
		//������ ������ ����. �������1���� ����
		int answer=1;
		
		//n�� 1�̸� 1�� ����
		if(N==1) return answer;
		
		
		//1�� �������� n�� �̵��ϸ� 6n���� �������� �ѷ��ΰ� ������ �̿��� N�� ���� ������ ���� �̵�Ƚ���� ����
		int range=1;
		int up=1;
		while(range<N) {
			answer++;
			range+=6*up;
			//����'��'�� 6�� ����
			up++;
		}
		
		return answer;
	}
}
