package original;

import java.util.Scanner;

public class A24NumberOfCases {
		
	public static void main(String[] args) {
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// �Է� �䱸 : 10 ~ 100
		System.out.print("���� �Է��Ͻÿ� : ");
		// �Է¹��� �� ����
		int num = sc.nextInt();
		// ���ǹ� ������ ���ڸ� ���� �� ���� ���� �� �ʱ�ȭ
		int cnt = 0;
		// for �� 1/2/3
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					// ������ ���԰� �Է��� ���� ��������
					if(2*i + 3*j + 5*k == num) {
						// ī��Ʈ�� �ø���
						cnt++;
						// ������ �߸� ����Ʈ
						System.out.print(String.format("(%d,%d,%d)", i, j, k));
					}
				}
			}
		}
		// ī��Ʈ�� ����Ʈ
		System.out.print(String.format(" : %d", cnt));
		sc.close();
	}
}