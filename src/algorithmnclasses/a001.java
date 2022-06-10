package algorithmnclasses;

public class a001 {

	public static void main(String[] args) {
		int i =0; int j=1; int k=1;
		
		while(i<19) {
			System.out.println("i : "+i+" j : "+j+" k : "+k);
			i++;
			j+=i;
			k+=j;
		}
		System.out.println("while¹® Å»Ãâ ÈÄÀÇ i : "+i+" j : "+j+" k : "+k);
	}

}
