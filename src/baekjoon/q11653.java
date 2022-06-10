package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q11653 {

	   public static void main(String[] args) throws Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		      int n = Integer.parseInt(br.readLine());
		      br.close();
		      while(true) {
		         if(n == 1) {
		            break;
		         }
		         else {
		            for(int i = 2; i<=n; i++) {
		               if(n%i == 0) {
		            	   bw.write(Integer.toString(i));
		            	   bw.write("\n");
		            	   n /= i;
		                  break;
		               }
		            }
		         }
		      }
		bw.close(); 
	   }


}
