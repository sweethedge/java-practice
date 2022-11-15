package original;

public class Test {
	public static int compare(int a, int b) {
//		// b가 a보다 크거나 같으면
//		if (a <= b) {
//			// b를 반환
//			return b;
//		}
//		// 그외의 다른 경우가 생겼으면 a를 반환
//		return a;
		return (a<=b)?b:a;
	}
	// 가감승제하는 메서드.
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public double div(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// 숫자 두 개를 선언
		int a = 100;
		int b = 1;
		//==================================================
		// 두 수를 비교하는 메서드를 호출해서 큰 값을 출력한다.
		System.out.println(compare(a, b));
		int c = compare(a, b);
		System.out.println(c);
		System.out.println(compare(2,5));
		System.out.println("=".repeat(50));
		//==================================================
		// 두 수를 가감승제하는 메서드를 호출해서 출력한다.
		int d = 3;	int e = 4;
		System.out.print(add(1,2) + " // ");	
		System.out.print(sub(1,2) + " // ");	
		System.out.print(mul(1,2) + " // ");
		System.out.println("add: " + add(d,e));
		Test f = new Test();
		System.out.println(f.div(0.2, 0.35));
		
	}
}
