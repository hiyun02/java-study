package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10995 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String star;
		for(int i=0;i<n;i++){
			
			if(i%2==0) star="* ";
			else star=" *";
			for(int k=0;k<n;k++){
				System.out.print(star);
			}
			System.out.println();
		}
	
	}

}
