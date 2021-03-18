import java.util.Scanner;

public class q1093 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[23]; /* 1~23번을 arr[0]~arr[22]에 저장, 0으로 초기화 */
		for (int i = 0; i < n; i++) {
			int m = s.nextInt();
			arr[m - 1]++; /* m을 입력받으면 m-1번째 배열값에 +1추가 */
		}
		for (int i = 0; i < 23; i++)
			System.out.print(arr[i]+" ");
	}

}
