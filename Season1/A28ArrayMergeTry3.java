package original;

public class A28ArrayMergeTry3 {
	// 각각의 배열 선언
	int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int [] B = { 10, 11, 12, 13, 14, 15, 16, 17, 18 };
	
	public void merge() {
		// 일단 좀 A만 복사가 되는지 볼까..
		int [] C = new int[A.length + B.length];
		// 0부터 A 길이까지
		for (int i = 0; i < A.length; i++) {
			// 일단 A 배열을 대입
			C[i] += A[i];
		}
		
		// 10부터 시작해서 B를 넣으려고 하는데..
		for (int j = 0; j < B.length; j++) {
			C[A.length + j] += B[j];
		}
		
		// 출력
		for (int d : C)
			System.out.print(d + " ");
	}
	
	public static void main(String[] args) {
		A28ArrayMergeTry3 gg = new A28ArrayMergeTry3();
		gg.merge();
	}

}
