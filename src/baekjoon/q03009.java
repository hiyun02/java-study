package baekjoon;

import java.util.Scanner;

public class q03009 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		Scanner s = new Scanner(System.in);

		for(int i=0;i<3;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
		}
		s.close();

		for(int i=0;i<2;i++) {
		if(arr[0][i]==arr[1][i]) System.out.print(arr[2][i]);
		else if(arr[0][i]==arr[2][i]) System.out.print(arr[1][i]);
		else System.out.print(arr[0][i]);
		System.out.print(" ");
	}
	}

}
