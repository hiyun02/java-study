package baekjoon;

import java.util.Scanner;

public class q10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
	
		int max =arr[0];
		int min =arr[0];
	
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		
		System.out.println(min+" "+max);
	}

}
