package original;

public class A31Fibonacci {
	public void asdf(int fn) {
		int f0 = 0;
		int f1 = 1;
		
		// 2���� ����ϴ� �ݺ���.
		for (int i = 2; i < fn; i++) {
			// �� �ΰ��� ���� �� �����ؼ�
			int sum = f0 + f1;
			// �װŸ� �ٷ� ����ϰ�
			System.out.print(sum + " ");
			// ���� �� �տ� ������ ��
			f0 = f1;
			// �װŴ� �տ� �ΰ��� ���� ������ �����Ѵ�.
			f1 = sum;
		}
	}
	public static void main(String[] args) {
		A31Fibonacci gg = new A31Fibonacci();
		gg.asdf(11);

	}

}

/*
 * �׷��ϱ� ���� �Ǻ���ġ�� �� �ΰ��� ���� ���ؼ� ���� ���� �̾Ƴ��� �����̴ϱ�
 * �� �ΰ��� ���� ���� ������ �ϳ� �����ϰ� �װ� ���� ����
 * �ڿ� �� �տ� �����ϰ�
 * �� ���� �Ŵ� �ΰ��� ���� ������ ���Եȴٴ� ����.
 * */
 