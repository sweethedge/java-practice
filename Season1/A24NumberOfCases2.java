package original;

public class A24NumberOfCases2 {
	// ���ο��� �� ���� ����
	int num;
	// ���ڿ� �޼��� ����
	String cases(int num) {
		// ������� ���� ���ڿ� ���� �ʱ�ȭ
		String result = "";
		// ī���� �ʱ�ȭ
		int cnt = 0;
		
		// for �� 3��
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num; j++) {
				for (int k = 1; k < num; k++) {
					// ������ g���� ���� �Ͱ� �Է°��� ��ġ�ϸ�
					if (2*i + 3*j + 5*k == num) {
						// ī��Ʈ �ø���
						cnt++;
						// ������ �� ���ڿ� ������ ��°� ��ȯ
						result += String.format("(%s, %s, %s)", i, j, k);
					}
				}
			}
		}
		// ��°��� ī���͵� ��ȯ
		return result + String.format(" : %d", cnt);
	}


	public static void main(String[] args) {
		// ��ü ����
		A24NumberOfCases2 gg = new A24NumberOfCases2();
		// ���
		System.out.println(gg.cases(31));

	}

}
