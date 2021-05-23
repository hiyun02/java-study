package z;

public class OverLoad {

	public static int add(int a, int b) {
		return a+b;
	}
	//매개변수의 개수가 다를 때 오버로딩 성립
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	//배개변수의 타입이 다를 때 오버로딩 성립
	public static double add(double a, double b) {
		return a+b;
	}
}
