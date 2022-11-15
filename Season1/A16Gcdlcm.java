package original;

public class A16Gcdlcm {
	// �ִ����� ��� �޼��� ����. �� ���� �μ��� ���´�.
	public static int gcd(int a, int b) {
		// b�� 0�� �ƴ� ����
		while (b != 0) {
			// a�� b�� ���� �������� �����ϴ� ������ ���� ��
			int temp = a % b;
			// �����ϴ� �� ���� ����.
			a = b;
			b = temp;
		}
		// a�� ��ȯ�ϰ�.
		return a;
	}
	// �ּҰ���� ��� �޼��� ����
	public static int lcm(int a, int b) {
		// �ִ������� ���� �޾ƿ���
		int gcd_value = gcd(a, b);
		// �� ���� ���ؼ� �ִ������� ������ �ּҰ������.
		return (a * b) / gcd_value;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(10, 15));
		System.out.println(lcm(10, 15));
	}
}
