package original;

public class A22Yoon {
	// �޼��� ����
	void yoon(int num) {
		// 4�� ���� �������� 0�̸�
		if (num % 4 == 0) {
			// ����
			System.out.println("����");
			// 100���� ���������� 400���� ���������� �ʴ� �ش�
		} else if (num % 100 == 0 && num % 400 != 0) {
			// ���
			System.out.println("���");
			// �� �ܿ��� ���
		} else System.out.println("���");
		
	}
	public static void main(String[] args) {
		A22Yoon gg = new A22Yoon();
		gg.yoon(1807);
	}

}
