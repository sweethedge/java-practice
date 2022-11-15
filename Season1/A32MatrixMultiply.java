package original;

public class A32MatrixMultiply {
	
	// 메서드 선언해서 인자값에 차례대로 넣고
	public void asdf (
			int a11, int a12, int a21, int a22, 
			int b11, int b12, int b21, int b22
			) {
		
		// 파워포인트에 적혀 있는 거 그대로 친다.
		System.out.println("|" + ((a11*b11)+(a12*b21)) + " " + ((a11*b12)+(a12*b22) + "|"));
		System.out.println("|" + ((a21*b11)+(a22*b21)) + " " + ((a21*b12)+(a22*b22) + "|"));
	}
	public static void main(String[] args) {
		A32MatrixMultiply gg = new A32MatrixMultiply();
		gg.asdf(1, 2, 3, 4, 5, 6, 7, 8);

	}

}
