package programers;

import java.util.Arrays;

public class step1_completion {

	public static void main(String[] args) {
		String[] participant = {"eden", "kiki" ,"leo"};
		String[] completion = {"eden", "kiki"};
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] str1, String[] str2) {
		Arrays.sort(str1);
		Arrays.sort(str2);
		int i=0;
		while(str2[i].equals(str1[i])) {
			i++;
			if(i==str2.length) {
				return str1[str1.length-1];
			}
		}
		return str1[i];
	}
	
}
