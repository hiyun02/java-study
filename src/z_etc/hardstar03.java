package z_etc;

public class hardstar03 {

	public static void main(String[] args) {
		//�ٸ��� ���� ������ ������ �����ϰ� print�� �� ������ ������ ������ �ٿ�������.
//�Ҵ�� ������ ��� ������ ���� ��� �����ϰ� ������ ��� ������ ������ �Ѵ�.
		int rowstar = 1, rowblank = 2;
		int blank=rowblank;
		int star=rowstar;
		
		for (int i = 1; i < 20; i++) {
			if (blank>0) {
				System.out.print(" ");
				blank--;
			} else {
				System.out.print("*");
				star--;
			}
			if (star==0) {
				System.out.println();
				if (i<12) {
					rowstar+=2; rowblank--;
					blank=rowblank;
					star=rowstar;
					}
				else {
					rowstar-=2; rowblank++;
					blank=rowblank;
					star=rowstar;
				}			
			}
		}
	}

}
