package original;

public class A16Gcdlcm {
	// 최대공약수 계산 메서드 개막. 두 개의 인수를 갖는다.
	public static int gcd(int a, int b) {
		// b가 0이 아닌 동안
		while (b != 0) {
			// a를 b로 나눈 나머지를 대입하는 변수를 만든 뒤
			int temp = a % b;
			// 복사하는 두 줄을 쓴다.
			a = b;
			b = temp;
		}
		// a를 반환하고.
		return a;
	}
	// 최소공배수 계산 메서드 개막
	public static int lcm(int a, int b) {
		// 최대공약수의 값을 받아오고
		int gcd_value = gcd(a, b);
		// 두 개를 곱해서 최대공약수로 나눈게 최소공배수다.
		return (a * b) / gcd_value;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(10, 15));
		System.out.println(lcm(10, 15));
	}
}
