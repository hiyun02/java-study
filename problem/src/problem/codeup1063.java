package problem;

import java.util.Scanner;

public class codeup1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();

int result1 = a>b ? a:b;
int result2 = result1>c ? result1:c;
System.out.println(result2);
	}

}
