package problem;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1027 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] arr = str.split("\\.");
		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
		System.out.printf("%02s-%02s-%04s",arr[2],arr[1],arr[0]);
//	Scanner s = new Scanner(System.in);
//	String str = s.nextLine();
//	String[] arr = str.split("[.]");
//	int a =  Integer.parseInt(arr[0]);
//	int b =  Integer.parseInt(arr[1]);
//	int c =  Integer.parseInt(arr[2]);;
//	System.out.printf("%02d-%02d-%04d", c,b,a);
	}

}
