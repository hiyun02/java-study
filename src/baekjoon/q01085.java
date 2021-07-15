package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q01085 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int arr[] = new int[4];
		
		for(int i=0; i<4; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		bw.write(Integer.toString(solution(arr)));
		bw.close();
		st=null;
		br.close();
	}
	public static int solution(int[] num) {  
		return Math.min(Math.min(num[2]-num[0], num[0]) , Math.min(num[3]-num[1], num[1]));
	}
}
