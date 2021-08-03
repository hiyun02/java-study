package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class q02445 {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = s.nextInt();
		s.close();
		String star="*";
		String blank=" ";
		int nstar=0;//별의 개수/2
		
		for(int i=1;i<=2*n-1;i++) {
			if(i>n) nstar--;
			else nstar++;
			
			for(int j=1;j<=2*n;j++) {
				if(j<=nstar||2*n-j<nstar) bw.write(star);
				else bw.write(blank);
			}
			
			bw.write("\n");
		}
		
		bw.close();
	}

}
