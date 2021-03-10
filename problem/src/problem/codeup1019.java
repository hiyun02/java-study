package problem;

import java.util.Scanner;

public class codeup1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		switch (str.length()) {

		case 6:
			a = Integer.parseInt(str.substring(0, 2));
			b = str.charAt(3) - '0';
			c = str.charAt(5) - '0';
			System.out.printf("%04d.%02d.%02d", a, b, c);
			break;
		case 7:
			a = Integer.parseInt(str.substring(0, 2));
			if (str.charAt(4) == '.') {
				b = str.charAt(3) - '0';
				System.out.printf("%04d.%02d%s", a, b, str.substring(4, 7));
			}

			else {
				c = str.charAt(6) - '0';
				System.out.printf("%04d%s%02d", a, str.substring(2, 6), c);
			}
			break;
		case 8:
			if (str.charAt(2) == '.') {
				a = Integer.parseInt(str.substring(0, 2));
				String st = str.substring(2, 8);
				System.out.printf("%04d%s", a, st);
			}

			else {
				b = str.charAt(5) - '0';
				c = str.charAt(7) - '0';
				System.out.printf("%s%02d.%02d", str.substring(0, 5), b, c);
			}

			break;
		case 9:
			if (str.charAt(6) != '.') {
				b = str.charAt(8) - '0';
				System.out.printf("%s%02d", str.substring(0, 8), b);
			} else {
				b = str.charAt(5) - '0';
				System.out.printf("%s%02d%s", str.substring(0, 5), b, str.substring(6, 9));
			}
			break;
		case 10:
			System.out.println(str);
			break;

		}
	}

}