package original;

public class A23General {

	public void calculate(double a, double b, double c, double d) {
		if (a == c) {
			System.out.println("���Ⱑ ������ �����̰ų� �Ҵ��̴�.");
		} else {
			System.out.println("f(x) = " + a + "x" + "+" + b);
			System.out.println("g(x) = " + c + "x" + "+" + d + " �϶�");

			System.out.println("x = " + (d-b)/(a-c) + ", " + "y = " + (a*d-b*c)/(a-c));
		}
	}

	public static void main(String[] args) {
		A23General gg = new A23General();
		gg.calculate(1, 2, -1, 3);
		gg.calculate(2, 3, 2, 5);

	}
}

/*
 * WolframAlpha�� �������� �� ���������� y=ax+b, y=cx+d��
 * �Ϲ��ظ� ������ ���� ������
 * �ϴ� �� ������ ���Ⱑ �ٸ� �� (a �� c, ���Ⱑ ���ٸ� �ذ� �����ϰų� ����.)
 * x = (d-b)/(a-c), y = (ad-bc)/(a-c) �̹Ƿ�
 * ���� �ʵ� a, b, c, d�� �����ϰ�
 * �׿� ���� �����ڿ� �Ű����� (int a, b, c, d)�� �ְ�
 * a�� c�� ���� ���� ����־����� �߸� �־��ٰ� �ϰ� break;
 * �ƴϸ� �׿� ���� �Ϲ��ظ� ����ϴ� �޼��带 �����
 * �ؿ��� ����Ѵ�.
 */