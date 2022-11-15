package original;

import java.util.Scanner;

public class A16Gcdlcm2 {

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
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// while ������ �� ���� �ʱ�ȭ
		int f = 0;
		// �ϴ� ������ ���� �ϰ�
		while(true) {
			// �Է� �䱸 : "�ִ������� ����Ϸ��� 1, �ּҰ������ ����Ϸ��� 2, �����Ϸ��� 3�� �Է��Ͻÿ�: "
			System.out.print("�ִ������� ����Ϸ��� 1, �ּҰ������ ����Ϸ��� 2, �����Ϸ��� 3�� �Է��Ͻÿ�: ");
			// ��ĳ�ʿ��� ���� �� ����ְ�
			f = sc.nextInt();
			// 3 ���� ����������
			if (f == 3) {
				// �� ���� �ϰ�
				System.out.println("Bye!");
				// ����������
				break; 
			}
			// �װ� �ƴ϶�
			else {
				// 1�̶��
				if (f == 1) {
					// a �Է� �䱸
					System.out.print("���� a�� �Է��Ͻÿ� : ");
					// a�� ����
					int a = sc.nextInt();
					// b �Է� �䱸
					System.out.print("���� b�� �Է��Ͻÿ� : ");
					// b�� ����
					int b = sc.nextInt();
					// �ִ����� ���
					System.out.println(gcd(a,b));
					// 2���
				} if (f == 2) {
					// ������ ģ �� �� �� �� ġ��, �ּҰ���� �Է�
					System.out.print("���� a�� �Է��Ͻÿ� : ");
					int a = sc.nextInt();
					System.out.print("���� b�� �Է��Ͻÿ� : ");
					int b = sc.nextInt();
					System.out.println(lcm(a,b));
					// �ٸ� �� ���� �� ��Ʈ �ϳ�
				} else System.out.println("�߸� �Է���");
			} 
		}
	}
}
