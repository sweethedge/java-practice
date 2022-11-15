package original;

public class A24NumberOfCases2 {
	// 메인에서 쓸 변수 선언
	int num;
	// 문자열 메서드 개막
	String cases(int num) {
		// 결과값을 받을 문자열 변수 초기화
		String result = "";
		// 카운터 초기화
		int cnt = 0;
		
		// for 문 3번
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num; j++) {
				for (int k = 1; k < num; k++) {
					// 각각의 g수를 더한 것과 입력값이 일치하면
					if (2*i + 3*j + 5*k == num) {
						// 카운트 올리고
						cnt++;
						// 위에서 쓴 문자열 변수에 출력값 반환
						result += String.format("(%s, %s, %s)", i, j, k);
					}
				}
			}
		}
		// 출력값에 카운터도 반환
		return result + String.format(" : %d", cnt);
	}


	public static void main(String[] args) {
		// 객체 선언
		A24NumberOfCases2 gg = new A24NumberOfCases2();
		// 출력
		System.out.println(gg.cases(31));

	}

}
