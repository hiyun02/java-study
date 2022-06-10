package programers;

import java.util.Arrays;
import java.util.Collections;

public class step1_stringreverse {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	
	public static String solution(String s) {
		String[] arr = s.split("");
		Arrays.sort(arr,Collections.reverseOrder());
		
		StringBuilder sb  = new StringBuilder();
		
		for(String i : arr) {
			sb.append(i);
		}
		return sb.substring(0, s.length());
	}
	
//	public String reverseStr(String str){
//	    char[] sol = str.toCharArray();
//	    Arrays.sort(sol);
//	    return new StringBuilder(new String(sol)).reverse().toString();
//	    }
}
