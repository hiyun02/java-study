package programers;

import java.util.Arrays;

public class step1_reverse {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(12345)));
		
	}

	public static int[] solution(long n) {
		String str=n+"";
		int[] answer= new int[str.length()];
		for(int i= str.length()-1;i>=0;i--) {
			answer[(str.length()-1)-i]=str.charAt(i)-'0';
		}
		return answer;
	}
}
