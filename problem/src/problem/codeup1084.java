package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup1084 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr[] = br.readLine().split(" ");
		int r = Integer.parseInt(arr[0]);
		int g = Integer.parseInt(arr[1]);
		int b = Integer.parseInt(arr[2]);
		
		int count =0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int k = 0; k < b; k++) {
					bw.write(i + " " + j + " " + k+"\n");
			count++; }
			}
		}
		bw.write(String.valueOf(count));
bw.flush();
bw.close();
br.close();
	}

}
