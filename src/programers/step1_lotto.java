package programers;

import java.util.Arrays;
import java.util.HashMap;

public class step1_lotto {

	public static void main(String[] args) {

		int[] a= {0,0,11,12,13,14};
		int[] b= {9,10,11,12,13,14};
		
		System.out.println(Arrays.toString(Solution(a,b)));
	}

	public static int[] Solution(int[] lotto, int[] win_nums) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		int zero=0;
		int rank=0;
		
		for(int i : lotto) {
			if(i==0) zero++;	
			else map.put(i, true);
		}
		
		for(int i : win_nums) {
			if(map.containsKey(i)) rank++;
		}

		int[] answer = {Math.min(7-(zero+rank), 6) , Math.min(7-rank, 6)};
		
		return answer;
	}
}
