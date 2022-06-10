package baekjoon;

import java.util.Scanner;

public class q01699 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int k = (int) Math.sqrt(num);
		
		//num�� ������ �����κк��� 1���� ���ڵ��� ���� ���� n�� ���� �غ�
		int arr[] = new int[k];
		for(int i=k;i>0;i--) {
			arr[k-i]=i;
		}
		//n�� ������� ����� �� k������ ���� �迭
		int answer[] = new int[k];
		answer[k-1]=num;//ex) 1�� num�� ����ϴ� ���
		
		//num�� 1�� ���� �������� ����
		for(int i=0;i<k-1;i++) {
			int n=num;
			int j=i;
			int m=0;
			while(n!=0) {
				m = arr[j]*arr[j];
				while(n<m) {
					m = arr[++j]*arr[j];
				}
				n -= m;
				answer[i]++;
			}
		}
		
		for(int i : answer) {
			if(i<num)
				num=i;
		}
		System.out.println(num);
		scn.close();
	}
}
