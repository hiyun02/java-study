package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q01032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		bw.write(solution(arr));
		bw.close();
		br.close();

	}

	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();

		boolean b1;
		boolean b2;
		
		int n = arr[0].length();
		for (int i = 0; i < n; i++) {
			 b1 = true;
			 b2 = true;
			char ch = arr[0].charAt(i);
			for (String k : arr) {
				if (k.charAt(i) != ch)
					b1 = false;
			}

			if (b1) {
				if (ch == '.') {
					String extention = arr[0].substring(i);
					for (String k : arr) {
						if (!k.substring(i).equals(extention)) 
							b2 = false;
					}
					if (b2) {
						sb.append(extention);
						break;
					} else
						ch = '?';
				}
				sb.append(ch);
			} else {
				sb.append("?");
			}
		}

		return sb.toString();
	}
}
