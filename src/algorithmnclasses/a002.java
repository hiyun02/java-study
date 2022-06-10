package algorithmnclasses;

public class a002 {

	public static void main(String[] args) {
		int a=15, b=12;
		int big=0, small=0;
		int nmg=1;
		int gcm=0, lcd=0;
		
		if(a>b) {
			 big=a;
			  small=b;
		} else {
		     big=b;
		     small=a;
		}
		System.out.println("while문 진입 전 big : "+big+" small : "+small);
		while(!(nmg==0)) {
			System.out.print("mok : "+big/small);
			nmg=big%small;
			big=small;
			small=nmg;
			System.out.println(" nmg : "+nmg+" big : "+big+" small : "+small);
		}
		
		gcm=big;
		lcd=a*b/gcm;
		System.out.println("gcm : "+gcm+" lcd : "+lcd);
		
	}
}
