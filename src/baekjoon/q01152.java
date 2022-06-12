package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class q01152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		bw.write(Integer.toString(solution(str)));
		bw.close();
		br.close();
	}

	public static int solution(String s) {
		
		StringTokenizer st = new StringTokenizer(s);

		return st.countTokens();
		
	}
}
