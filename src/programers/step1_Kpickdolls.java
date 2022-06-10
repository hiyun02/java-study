package programers;

import java.util.ArrayList;

public class step1_Kpickdolls {

	public static void main(String[] args) {
		
		int[][] a = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] b= {1,5,3,5,1,2,1,4};
		System.out.println(solution(a,b));
	}

	public static int solution(int[][] board, int[] moves) {

		ArrayList<Integer> bucket = new ArrayList<>();

		int height = board.length;
		for (int i : moves) {

			for (int k = 0; k < height; k++) {
				int space = board[k][i - 1];
				if (space != 0) {
					bucket.add(space);
					board[k][i - 1] = 0;
					break;
				}

			}
		}

		int answer = 0;
		int size = bucket.size();
		boolean bool;

		do {
			bool=false;
			for (int i = 0; i < size - 1; i++) {
				if (bucket.get(i) == bucket.get(i + 1)) {
					bucket.remove(i);
					bucket.remove(i);
					size -= 2;
					answer += 2;
					bool = true;
				}
			}

		} while(bool);
		return answer;
	}
}
