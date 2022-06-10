package baekjoon;

import java.util.Scanner;

public class q10809 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		int[] arr = new int['z' - 'a' + 1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < S.length(); j++) {
				if (i == S.charAt(j)-'a') {
					arr[i] = j;
				break;				
				}
				else {
					arr[i]=-1;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
