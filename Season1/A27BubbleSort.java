package original;

public class A27BubbleSort {

	public static void main(String[] args) {
		// �迭 ����
		int [] arr = {42, 26, 10, 6, 11, 36, 2};
		// �迭�� ������ �ݺ�
		for (int i = 0; i < arr.length; i++) {
			// �� �� ������ �Ǿ����Ƿ�
			// �� �� ���� �� ���̸�ŭ �ݺ�
			for (int j = 0; j < arr.length-1; j++) {
				// ���� �ں��� ũ��
				if (arr[j] > arr[j+1]) {
					// ���� ���� �ӽ÷� ���� �ְ�
					int temp = arr[j+1];
					// ���� ���� �ڿ� ġȯ�� ����
					arr[j+1] = arr[j];
					// �ӽ÷� ���� ���� �տ� ����
					arr[j] = temp;
				}
			}
		}
		
		for (int a : arr)
			System.out.print(a + " ");
	}
}
