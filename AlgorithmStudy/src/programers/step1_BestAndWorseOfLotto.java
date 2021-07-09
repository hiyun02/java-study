package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class step1_BestAndWorseOfLotto {

	public static void main(String[] args) {
		int[] lot = { 45, 1, 3, 2, 31, 19 };
		int[] win = { 31, 10, 45, 1, 6, 19 };
		System.out.println(Arrays.toString(solution(lot, win)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		ArrayList<Integer> llist = new ArrayList<>();
		ArrayList<Integer> wlist = new ArrayList<>();

		int rnk = 0;

		for (int i : lottos) {
			llist.add(i);
		}
		for (int i : win_nums) {
			wlist.add(i);
		}

		Collections.sort(llist);
		Collections.sort(wlist);

		int zero = 0;
		int size = llist.size();

		for (int i = 0; i < size; i++) {
			if (llist.get(i) == 0)
				zero++;
			else {
				if (wlist.contains(llist.get(i)))
					rnk++;
			}

		}

		int[] answer = { Math.min(7 - (zero + rnk), 6), Math.min(7 - rnk, 6) };

		return answer;

	}

	public int[] Solution(int[] lottos, int[] win_nums) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		int zero = 0;
		int rank = 0;

		for (int i : lottos) {
			if (i == 0)
				zero++;
			else
				map.put(i, true);
		}

		for (int i : win_nums) {
			if (map.containsKey(i))
				rank++;
		}

		int[] answer = { Math.min(7 - (zero + rank), 6), Math.min(7 - rank, 6) };

		return answer;
	}
}
