package programers;

import java.util.Arrays;
import java.util.Scanner;

public class steo1_GCDandLCM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		
		System.out.println( Arrays.toString(solution(a, b)) );
		
		
	}

	public static int[] solution(int x, int y) {
		int answer[] = new int[2];
		answer[0]=gcd(x,y);
		answer[1]=x*y/answer[0];
		return answer;
	}
	public static int gcd(int p, int q) {
		if(q==0) return p;
		else return gcd(q, p%q);
	}
}
