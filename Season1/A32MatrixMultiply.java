package original;

public class A32MatrixMultiply {
	
	// �޼��� �����ؼ� ���ڰ��� ���ʴ�� �ְ�
	public void asdf (
			int a11, int a12, int a21, int a22, 
			int b11, int b12, int b21, int b22
			) {
		
		// �Ŀ�����Ʈ�� ���� �ִ� �� �״�� ģ��.
		System.out.println("|" + ((a11*b11)+(a12*b21)) + " " + ((a11*b12)+(a12*b22) + "|"));
		System.out.println("|" + ((a21*b11)+(a22*b21)) + " " + ((a21*b12)+(a22*b22) + "|"));
	}
	public static void main(String[] args) {
		A32MatrixMultiply gg = new A32MatrixMultiply();
		gg.asdf(1, 2, 3, 4, 5, 6, 7, 8);

	}

}
