package original;

public class A21Gugudan {

	// �޼��� ȣ���� �� ���� num�� �޾Ƽ� �޼��带 �����ϰ�
	public void printGugudan(int num) { 
		// num�� 1���� ���ų� 9 �̻��̸�
		if (num < 1 || 9 <= num) { 
			// ������ ����ϰ� ����������.
			System.out.println("num is not valid!"); return;

		}
		// �ϴ� ������ ���� �� �� �ݺ��� ����.
		for (int i = 2 ; i < 10 ; i+=num) {
			// ���׿� �� �ݺ��� ����
			for (int j = 1 ; j < 10 ; j++) {
				// ���� �� �� �� �ݺ��� ����
				for (int k = 0 ; k < num ; k++) { 
					// ������ 10 �̻��� �Ǹ�
					if (i+k >= 10) {
						// ���� ġ�� ����������
						System.out.println();
						break;
					}
					
					// ū ����ǥ �ȿ� �ִ� �������� ��ǥ �ڿ� �ִ� ���� ��´�.
					// num�� 2��� k�� 1�����ۿ� �� ���°Ű�, �׷��� (i+k)�� �ؼ� 3�� ���� �Ŵ�.
					System.out.printf("%d*%d=%d", (i+k), j, (i+k)*j); 
					// 2���̶�� ���� �� ��.
					if (k < num -1)	System.out.print("\t");
					// k�� num-1�� ����������, �׷��ϱ� ���� ������
					else			System.out.println(); 
				}
			}
			// j, k�� ���� �ݺ����� �� ���� ����.
			System.out.println();

		}
	}	

	public static void main(String[] args) {
		// ������ Ŭ������ ��ü�� �����Ѵ�. ������ ��ü�� �̸��� gg�̴�.
		A21Gugudan gg = new A21Gugudan(); 
		// �޼��� ȣ��
		gg.printGugudan(2); 
	}

}
