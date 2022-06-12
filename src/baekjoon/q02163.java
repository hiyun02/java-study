package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class q02163 {

	public static int solution(int n, int m) {
		return n*m-1;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st=null;
		bw.write(Integer.toString(solution(N,M)));
		bw.close();
	}
	
}
