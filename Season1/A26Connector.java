//Textbook > edu > Test32.java

package original;

public class A26Connector {
	public static void main(String[] args) {


		// �迭 ���� 2 : new ������ ����
		String arr[] = {
				"���� : 599 ��", 
				"�λ� : 51 ��", 
				"��õ : 46 ��", 
				"���� : 43 ��", 
				"�뱸 : 27 ��"
		}; 

		// �ݺ������� ���
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
		
		// Ȯ�� for ������ ���
		for (String a : arr)
			System.out.println(a);
		}
	}



// �迭 ���� 1 
// String arr[] = new String[5]; 

// �迭�� �� ���� 
//arr[0] = "���� : 599 ��";
//arr[1] = "�λ� : 51 ��"; 
//arr[2] = "��õ : 46 ��"; 
//arr[3] = "���� : 43 ��"; 
//arr[4] = "�뱸 : 27 ��";


/* �迭 ���� 3 : ���� new �����ڸ� ����
		String arr[] = new String[] {
				"���� : 599 ��", 
				"�λ� : 51 ��", 
				"��õ : 46 ��", 
				"���� : 43 ��", 
				"�뱸 : 27 ��"
		};

 */