package original;

public class A28ArrayMergeTry3 {
	// ������ �迭 ����
	int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int [] B = { 10, 11, 12, 13, 14, 15, 16, 17, 18 };
	
	public void merge() {
		// �ϴ� �� A�� ���簡 �Ǵ��� ����..
		int [] C = new int[A.length + B.length];
		// 0���� A ���̱���
		for (int i = 0; i < A.length; i++) {
			// �ϴ� A �迭�� ����
			C[i] += A[i];
		}
		
		// 10���� �����ؼ� B�� �������� �ϴµ�..
		for (int j = 0; j < B.length; j++) {
			C[A.length + j] += B[j];
		}
		
		// ���
		for (int d : C)
			System.out.print(d + " ");
	}
	
	public static void main(String[] args) {
		A28ArrayMergeTry3 gg = new A28ArrayMergeTry3();
		gg.merge();
	}

}
