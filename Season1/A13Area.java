package original;

import java.util.Scanner;

public class A13Area {

	public static void main(String[] args) {
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// �ﰢ��/�簢�� �Ǻ� ���� ����
		int sam;

		// �غ� ���� ����
		int numOne = 0;
		// ���� ���� ����
		int numTwo = 0;
		// 1�� 2�� ���� ������ ����
		

		// �ﰢ������ �簢������ �䱸
		System.out.print("�ﰢ���̸� 3, �簢���̸� 4�� �Է��ϼ��� : ");
		// �Է� ���� �� �Ǻ� ������ ����
		 sam = sc.nextInt();
		// sam�� 1�� ���� �� if �� ����
		if (sam == 3) {
		// �غ� �Է� �䱸
			System.out.print("�غ��� �Է��ϼ���: ");
		// ����� �غ� �Է� ������ ����
			numOne = sc.nextInt();
		// ���� �Է� �䱸
			System.out.print("���̸� �Է��ϼ���: ");
		// ����� ���� �Է� ������ ����
			numTwo = sc.nextInt();
		// �ﰢ���� ������ ����� ���� ����
			int area = (numOne*numTwo)/2;
			// �ﰢ�� ����Ʈ
			System.out.println("�ﰢ���� ���� = " + area);
			
		} else if (sam == 4) {
			// ���� ���� �䱸
			System.out.print("���� ���̸� �Է��ϼ���: ");
			// ���� ���θ� ����
			numOne = sc.nextInt();
			// ���� ���� �䱸
			System.out.println("���� ���̸� �Է��ϼ���: ");
			// ���� ���� ����
			numTwo = sc.nextInt();
			// �簢�� ����Ʈ
			System.out.println("�簢���� ���� = " + numOne*numTwo);
		}
		// ��ĳ�� ���ݱ�
		sc.close();
	}
}
