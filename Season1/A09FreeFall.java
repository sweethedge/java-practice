package original;

import java.util.Scanner;

public class A09FreeFall {

	public static void main(String[] args) {
		// ���� : 1000 - 4.905 * n * n 
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���� ����
		int n;
		// �� �Է� �䱸
		System.out.print("n�� �� ��ġ�� �Է��Ͻÿ� : ");
		// �Է¹��� ���� ������ ���� 
		n = sc.nextInt();
		// ������ ���Թ��� ���� ����
		float o = (float) (1000-4.905*n*n); 
		// ������ 0���� �۰ų� ���ٸ�
		if (o <= 0) {
		// �����̶�� �޽��� ���
			System.out.println("�̹� ���ٴ��Դϴ�.");
		// �װ� �ƴ� �� �޽��� ���
		} else System.out.println(n + "�� �� ��ġ : " + o + "m");
		// ��ĳ�� �� �ݱ�
		sc.close();
	}

}
