package baekjoon;
import java.math.BigInteger;
import java.util.Scanner;

public class q10757 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();

			BigInteger bnumber1=new BigInteger(a);
			BigInteger bnumber2=new BigInteger(b);
			
			System.out.println(bnumber1.add(bnumber2));
	}

}
