package programers;

public class step1_weeklychallenge1 {

	//���̱ⱸ�� ���� �̿��� price�ε� n��° �̿��� ������ n���� �̿�Ḧ �޴´�. 
	//�����ݾ��� money���, �󸶰� ���ڶ� �� �����ϴ� �Լ�. ���ڸ��� ������ 0�� �����Ѵ�.
	public static long solution(long price, long money, long count) {
		//���������� �հ��İ� max()�� �̿�
		return Math.max(price*(count*(1+count)/2)-money,0);
	}

	//�������
	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}
}
