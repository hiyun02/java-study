package baekjoon;

import java.util.Scanner;

public class q01699 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int k = (int) Math.sqrt(num);
		
		//num의 제곱근 정수부분부터 1까지 숫자들의 합을 통해 n을 만들 준비
		int arr[] = new int[k];
		for(int i=k;i>0;i--) {
			arr[k-i]=i;
		}
		//n이 만들어질 경우의 수 k가지를 담을 배열
		int answer[] = new int[k];
		answer[k-1]=num;//ex) 1을 num개 사용하는 경우
		
		//num이 1일 때는 실행하지 않음
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
