package original;

import java.util.Scanner;

public class A13_1Area {

	public static void main(String[] args) {
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// �ﰢ��/�簢��, ���� �Ǻ� ���� ����
		int sam = 0;

		// �غ� ���� ����
		int numOne;
		// ���� ���� ����
		int numTwo;
		
//		while (sam != 0) { - �̷��� ���ٸ�, 0�� ���� if���� �������� �ʾƵ� �ȴ�.
		// ������ ���̶� ���� while ���� �����Ѵ�.
		while (true) {
			// �ﰢ������ �簢������ �䱸 - 0�̸� �����Ѵٴ� ���� ����
			System.out.print("�ﰢ���̸� 3, �簢���̸� 4, �����Ϸ��� 0�� �Է��Ͻÿ� : ");
			// �Է� ���� �� �Ǻ� ������ ����
			sam = sc.nextInt();
			// ������ �Էµ� ���� 0�̶��
			if (sam == 0) {
				// �ݺ������� �������´�.
				break;
			}
			// sam�� 3�� ���� �� if �� ����
			else if (sam == 3) {
				// �غ� �Է� �䱸
				System.out.print("�غ��� �Է��Ͻÿ� : ");
				// ����� �غ� �Է� ������ ����
				numOne = sc.nextInt();
				// ���� �Է� �䱸
				System.out.print("���̸� �Է��Ͻÿ� : ");
				// ����� ���� �Է� ������ ����
				numTwo = sc.nextInt();
				// �ﰢ���� ������ ����� ���� ����
				int area = (numOne*numTwo)/2;
				// �ﰢ�� ����Ʈ
				System.out.println("�ﰢ���� ���� = " + area);
				// �ﰢ���� �ƴ϶� �簢���϶��� else if�� ����
			} else if (sam == 4) {
				// ���� ���� �䱸
				System.out.print("���� ���̸� �Է��Ͻÿ� : ");
				// ���� ���θ� ����
				numOne = sc.nextInt();
				// ���� ���� �䱸
				System.out.print("���� ���̸� �Է��Ͻÿ� : ");
				// ���� ���� ����
				numTwo = sc.nextInt();
				// �簢�� ����Ʈ
				System.out.println("�簢���� ���� = " + numOne*numTwo);
			}
		}
		// ��ĳ�� ���ݱ�
		sc.close();
		System.out.println("Bye");
	}
}
