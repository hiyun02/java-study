package baekjoon;

import java.io.*;

public class q01924 {
//��¥�� �Է¹����� 2007�� ���� ���� �������� ����ϴ� ����
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
		//��¥��==1��1�Ϻ��� m��d�ϱ����� ������ �� ���� ��
		//��¥���� ���ϰ� ������ ��ȯ���� �̿��� ������ �ذ�
		
		//��¥���� ���ϱ� ���� �� ���� ������ �迭�� ����
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		//1��1���� �������̹Ƿ� ��¥���� 7�γ��� �������� 1�� �� �ε����� ���� "MON"�� ��ȯ�ǵ��� ���� �迭�� ����
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		//��¥���� ������ ����
		int sum = 0;
		
		//1��1�Ϻ��� �Է¹��� ��(m��)�� �����ϱ���� ������ �ϼ��� ����
		for(int i=0;i<m-1;i++) {
			sum+=month[i];
		}
		
		//n�ϸ�ŭ ���Ͽ� �ϼ�
		sum+=d;
		
		//1�� 1�Ϻ��� 12�� 31�ϱ��� ���� �������� �ʰ� ���������� �þ������ SUN~SAT���� 7�� �ֱ�� ��ȯ��
		//�Է¹��� ��¥�� ���� ��¥�� sum�� �ᱹ �� ��ȯ�Ʒ� ���������Ƿ� 7�γ��� �������� �迭�� �ε����� �Ͽ� ������ ����
		return day[sum%7];
	}
	
}
