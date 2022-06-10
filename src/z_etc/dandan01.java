package z_etc;

public class dandan01 {

	public static void main(String[] args) {
		int a = 2, b = 1;
		while (a < 10 && b < 10) {
			if(b==1)System.out.println("<"+a+"´Ü>");
			System.out.println( a + "X" + b + "=" + a*b);
			b++;
			if(b==10) {
				a++; b=1;
				System.out.println();
			}
		}
	}

}
