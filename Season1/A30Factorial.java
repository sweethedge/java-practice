package original;

public class A30Factorial {
	// �޼��� ����
	public void factorial(int num) {
		// ���� �ϳ� �����ϰ�
		int a = 1;
		// �Ű�������ŭ ���� �ݺ��� �����ؼ�
		for (int i = 1; i <= num; i++) {
			// ���� ���� �־��ش�.
			a *= i;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		A30Factorial gg = new A30Factorial();
		gg.factorial(4);
	}
}
