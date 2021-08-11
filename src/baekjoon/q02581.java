package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q02581 {
	   public static void main(String[] args) throws IOException {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		      int min = Integer.parseInt(br.readLine());
		      int max = Integer.parseInt(br.readLine());
		      int sum = 0;
		      
		      if(min==1) min++;
		      ArrayList<Integer> arr = new ArrayList<>();
		      abc: for (int i = min; i < max+1; i++) {
		         for (int j = 2; j < (int) Math.sqrt((double) i) + 1; j++) {
		            if (i % j == 0) {
		               continue abc;
		            }
		         }
		         arr.add(i);
		         sum += i;
		      }


		      if (sum == 0) {
		         System.out.println(-1);
		      } else {
		         min = arr.get(0);
		         for (int k = 1; k < arr.size(); k++) {
		            if (min > arr.get(k)) {
		               min = arr.get(k);
		            }
		         }
		         System.out.println(sum);
		         System.out.println(min);
		      }

		   }

}
