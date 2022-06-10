package z_etc;

public class practice01 {

	public static void main(String[] args) {
		int i = 2;
		while (i < 10) {
			System.out.println("["+i+"]´Ü");
			int j = 1;
			while (j < 10) {
				System.out.print(i + "X" + j + "=" + i * j);
				System.out.println();
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
