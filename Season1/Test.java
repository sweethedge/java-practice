package original;

public class Test {
	public static int compare(int a, int b) {
//		// b�� a���� ũ�ų� ������
//		if (a <= b) {
//			// b�� ��ȯ
//			return b;
//		}
//		// �׿��� �ٸ� ��찡 �������� a�� ��ȯ
//		return a;
		return (a<=b)?b:a;
	}
	// ���������ϴ� �޼���.
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
		// ���� �� ���� ����
		int a = 100;
		int b = 1;
		//==================================================
		// �� ���� ���ϴ� �޼��带 ȣ���ؼ� ū ���� ����Ѵ�.
		System.out.println(compare(a, b));
		int c = compare(a, b);
		System.out.println(c);
		System.out.println(compare(2,5));
		System.out.println("=".repeat(50));
		//==================================================
		// �� ���� ���������ϴ� �޼��带 ȣ���ؼ� ����Ѵ�.
		int d = 3;	int e = 4;
		System.out.print(add(1,2) + " // ");	
		System.out.print(sub(1,2) + " // ");	
		System.out.print(mul(1,2) + " // ");
		System.out.println("add: " + add(d,e));
		Test f = new Test();
		System.out.println(f.div(0.2, 0.35));
		
	}
}
