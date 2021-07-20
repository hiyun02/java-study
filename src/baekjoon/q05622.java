package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q05622 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		System.out.println(solution(str));
		bf.close();
	}

	public static int solution(String s) {
		int time =0;
		
		int[] abc = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		int length = s.length();
		for(int i=0;i<length;i++) {
			time+=abc[s.charAt(i)-'A'];
			
			}
		return time+length;
	}
}
