package problem;

import java.util.Scanner;

public class codeup1022_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		int b = (int) a; // 정수부
		float c = a - b; // 실수부
		String str = c + "";
		System.out.println(b);
		System.out.println();

	}

}
