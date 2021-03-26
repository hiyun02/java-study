package problem;

import java.util.Scanner;

public class prog_str {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
 String s = sc.nextLine();
		
		System.out.println(solution(s));
		
		    }
	public static boolean solution(String s) {
		boolean answer = true;
		
		int n = s.length();
		if(n!=4&&n!=6) answer = false;
		else {
			answer = true;
			for(int i=0;i<n;i++){
				if(!('0'<=s.charAt(i)&&s.charAt(i)<='9'))
					answer = false;
			}
		}
		
		return answer;
	}

}
