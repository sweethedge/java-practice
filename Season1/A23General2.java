package original;

// Ŭ���� ¥�� ���� ȫ�����Բ��� �˷��ּż� ���������� ¥�� ®�µ� �̰�...
// �� ������ ���ư��� �� �Ͱ���.

/*
 * Ŭ���� ¥�� ��
 * 1. public class ���� �̸� ���� ����
 * 2. private ���� ����
 * 3. ������
 * 4. get/setter
 * 5. toString
 * */

// Ŭ���� ����
class Function {
	// ���� ����
	double a, b, c, d;

//	public Function(double a, double b, double c, double d) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//	}
	
	// �⺻ ������
	public Function() {
		// TODO Auto-generated constructor stub
	}
	
	// �޼��� ����
	public void calculate(double a, double b, double c, double d) {
		// a �� c �� ������
		if (a == c) {
			// ��� �Ұ� �޽���
			System.out.println("���Ⱑ ������ �����̰ų� �Ҵ��̴�.");
			// �ƴϸ�
		} else {
			// f(x) = ax+b, g(x) = cx+d �϶� 
			System.out.println("f(x) = " + a + "x" + "+" + b);
			System.out.println("g(x) = " + c + "x" + "+" + d + " �϶�");
			
			// x, y�� ��� �޽��� ���
			System.out.println("x = " + (d-b)/(a-c) + ", " + "y = " + (a*d-b*c)/(a-c));
		}
	}
}

public class A23General2 {
	public static void main(String[] args) {
		Function gg = new Function();
		gg.calculate(1, 2, 1, 4);
		gg.calculate(2, 3, 4, 5);
	}
}

