package baekjoon;

import java.io.*;

public class q01193 {
//�־��� �м�(1/1, 1/2, 2/1, ...)�� ������ ���� X��° �м��� ã�� ����

	//�����ذ� �Լ�
	public static String solution(int X) {
		//�м����� �и���� ���� 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, ... �� ���� ���¸� ��������� �̿�
	    //2�� 1��, 3�� 2��, 4�� 3��, 5�� 4��, ... �� ����� ���.
		int i=0; int sum=0;
		while(sum<X) {
			i++;
			sum+=i;
		}
		//while�� ���� ������ 'i��(�� ���� Ƚ��)'�� X��° �м��� �и���� ���� �ش� ������ '�� �� �����ϴ� ��'�� ���� ����
		//'�и�������� ������ ���� �߿��� X��° �м��� ���°�� ��' �˱� ���� while�� ��������� sum�� X�� ���� i���� ��
		int idx = i-(sum-X);
		//�������Ĵ�� ���ڿ��� �����ֱ� ���� ��Ʈ������ ����
		StringBuilder sb = new StringBuilder();
		//i+1�� X��° �м��� �и���� ����. �� ���� Ȧ�̸� ���ڰ� ���������̰�, ¦�̸� ����������. �׿� �°� �и��� ���� ������.
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
	
	//���� ���
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		br.close();
		bw.write(solution(X));
		bw.close();
		
	}

}
