package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class challenge6_hint {
//나머지의 정의와 수학적 성질을 이용한 알고리즘 만들기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // 입력받을 숫자의 개수
		int[] arr = new int[n]; // 입력받은 수를 배열에 저장
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
Arrays.sort(arr);
		
int a = arr[1]-arr[0];
int b = arr[2]-arr[0];
		

for(int i=2;i<=a;i++) {
	if(a%i==0&&b%i==0) {
		System.out.print(i+" ");
	}
}
		
			}

}
