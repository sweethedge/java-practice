package original;

public class A22Yoon {
	// 메서드 개막
	void yoon(int num) {
		// 4로 나눈 나머지가 0이면
		if (num % 4 == 0) {
			// 윤년
			System.out.println("윤년");
			// 100으로 나누어지고 400으로 나누어지지 않는 해는
		} else if (num % 100 == 0 && num % 400 != 0) {
			// 평년
			System.out.println("평년");
			// 그 외에는 평년
		} else System.out.println("평년");
		
	}
	public static void main(String[] args) {
		A22Yoon gg = new A22Yoon();
		gg.yoon(1807);
	}

}
