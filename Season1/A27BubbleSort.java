package original;

public class A27BubbleSort {

	public static void main(String[] args) {
		// 배열 선언
		int [] arr = {42, 26, 10, 6, 11, 36, 2};
		// 배열의 끝까지 반복
		for (int i = 0; i < arr.length; i++) {
			// 한 번 정렬이 되었으므로
			// 그 한 번을 뺀 길이만큼 반복
			for (int j = 0; j < arr.length-1; j++) {
				// 앞이 뒤보다 크면
				if (arr[j] > arr[j+1]) {
					// 뒤의 값을 임시로 집어 넣고
					int temp = arr[j+1];
					// 앞의 값을 뒤에 치환한 다음
					arr[j+1] = arr[j];
					// 임시로 넣은 값을 앞에 대입
					arr[j] = temp;
				}
			}
		}
		
		for (int a : arr)
			System.out.print(a + " ");
	}
}
