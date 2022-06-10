package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q01075 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
	
		System.out.printf("%02d",solution(a,b));
		br.close();
	}
	public static int solution(int x, int y) {
		int answer=0;
		
		x-=x%100;
		
		if(x%y!=0)
		answer=y-x%y;
		
		return answer;
	}
}
