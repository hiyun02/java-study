package baekjoon;

public class test {

	public static void main(String[] args) {
	//for(:)문 이해 예제
		int[] arr = {1,2,3,4};
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
		System.out.println();
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
