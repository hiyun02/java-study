package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class q3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int answer = 10;

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = s.nextInt();
			arr[i] = arr[i] % 42;
		}

	ArrayList<Integer> list = new ArrayList<>();
		
		for (int data : arr) {
			if(!list.contains(data))
				list.add(data);
			
		}
		System.out.println(list.size());
	}

}
