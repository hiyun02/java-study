package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q02941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
	
		bw.write(Integer.toString(solution(br.readLine())));
		bw.close();
		br.close();
	}
	public static int solution(String s) {
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(String i :arr)
		s=s.replaceAll(i, "*");
		
		return s.length();
	}
}
