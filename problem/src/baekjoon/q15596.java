package baekjoon;

import java.util.Scanner;

public class q15596 {

	static long sum(int[] a) {
long hap=0;
for(int i=0;i<a.length;i++) {
	hap+=a[i];
}
		return hap;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
	System.out.println(sum(arr));
	}
}
