package programers;

import java.util.Scanner;

public class step1_WordToNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(solution(str));
	}
	public static int solution(String s) {
		
		String nums[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		
		for(int i=0;i<10;i++) {
			s= s.replaceAll(nums[i], Integer.toString(i));
		}

		int answer=0;
		int length=s.length();
		
		for(int i=0; i<length;i++) {
			
			answer+=(s.charAt(i)-'0')*Math.pow(10, length-1-i);
			
		}
		
		return answer;
	}
}
