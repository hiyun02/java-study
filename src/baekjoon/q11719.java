package baekjoon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class q11719 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(s.hasNext()) {
			list.add(s.nextLine());
		}
		
		s.close();
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
