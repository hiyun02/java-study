package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class step1_knumber {

	public static void main(String[] args) {
		int[] aa = {1, 5, 2, 6, 3, 7, 4};
		int[][] bb = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		System.out.println(Arrays.toString(solution(aa, bb)));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		 ArrayList<Integer> arraylist = new ArrayList<>();
		 	for(int i : array) {
		 		arraylist.add(i);
		 	}
		 
	        for(int i=0; i<commands.length;i++){
	                ArrayList<Integer> iList = 
	                new ArrayList<>(arraylist.subList(commands[i][0]-1, commands[i][1]));
	                Collections.sort(iList);
	                answer[i]=iList.get(commands[i][2]-1);
	        }
		return answer;
	}
}
