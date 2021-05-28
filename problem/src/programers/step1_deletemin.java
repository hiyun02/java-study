package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class step1_deletemin {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution(numbers)));
	}

	private static int[] solution(int[] arr) {
		if (arr.length == 1) {
			int answer[] = { -1 };
			return answer;
		}
		else {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i: arr) {
				list.add(i);
			}
			int min = list.get(0);
			for(int i=0; i<list.size(); i++) {
				if(list.get(i)<min) min = list.get(i);
			}
			list.remove(list.indexOf(min));
			
		int[] answer = new int[list.size()];
		for(int i=0; i < answer.length; i++) {
			answer[i]=list.get(i);
		}
		list=null;
		return answer;
		}
	
	}
}
