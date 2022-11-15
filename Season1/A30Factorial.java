package original;

public class A30Factorial {
	// 메서드 개막
	public void factorial(int num) {
		// 변수 하나 선언하고
		int a = 1;
		// 매개변수만큼 도는 반복문 개막해서
		for (int i = 1; i <= num; i++) {
			// 곱한 값을 넣어준다.
			a *= i;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		A30Factorial gg = new A30Factorial();
		gg.factorial(4);
	}
}
