package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class challenge6_hint {
//�������� ���ǿ� ������ ������ �̿��� �˰��� �����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // �Է¹��� ������ ����
		int[] arr = new int[n]; // �Է¹��� ���� �迭�� ����
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
