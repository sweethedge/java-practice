package original;

import java.util.Scanner;

public class A14Sosu {

	public static void main(String[] args) {
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// �Է� �䱸
		System.out.print("�Է��Ͻÿ� : ");
		// �Է¹��� �� ����
		int num = sc.nextInt();
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� ���� ���� 2���� ���� ���� ���ǹ� ����
		if (num < 2) {
			// �ƴ϶�� ���
			System.out.println("�Ҽ� �ƴ�");
			// ����׷� return; �� ������ exit(); �޼��忡 ���� �ᱹ ���������� �ȴ�.
			return;
		}
		// 2 �� �Ҽ��̹Ƿ� ���°� 2���
		if (num == 2) {
			// �´ٰ� ����ְ�
			System.out.println("�Ҽ� ����");
			// ����������.
			return;
		}			
		// 2���� Ŭ ���� �ݺ��� ����
		for (int i = 3; i < num; i++) {
			// @ �׷��ϱ� i�� ���� Ŀ���鼭 ������� ���� ������ �Ŵ�. ���� ������ �����ϱ� �������� 0�̶�� ���� ������ �������ٴ� ����.
			// �׷��� �������� 0�̶��
			if ((num % i) == 0) {
				// �ƴ϶�� ����ϰ�
				System.out.println("�Ҽ� �ƴ�");
				// �������´�.
				return;
			}
				}
		// ���� ���� ��Ȳ�� �ƴ϶�� �Ҽ���� ���
		System.out.println("�Ҽ� ����");
		// ����������.
		return;
	}
}

// https://st-lab.tistory.com/81