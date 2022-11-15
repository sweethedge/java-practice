package original;

public class A21Gugudan {

	// 메서드 호출할 때 찍을 num을 받아서 메서드를 개막하고
	public void printGugudan(int num) { 
		// num이 1보다 적거나 9 이상이면
		if (num < 1 || 9 <= num) { 
			// 에러를 출력하고 빠져나간다.
			System.out.println("num is not valid!"); return;

		}
		// 일단 전항을 찍을 때 쓸 반복문 개막.
		for (int i = 2 ; i < 10 ; i+=num) {
			// 후항에 들어갈 반복문 개막
			for (int j = 1 ; j < 10 ; j++) {
				// 탭을 할 때 쓸 반복문 개막
				for (int k = 0 ; k < num ; k++) { 
					// 전항이 10 이상이 되면
					if (i+k >= 10) {
						// 엔터 치고 빠져나오기
						System.out.println();
						break;
					}
					
					// 큰 따옴표 안에 있는 형식으로 쉼표 뒤에 있는 값을 찍는다.
					// num이 2라면 k는 1까지밖에 안 가는거고, 그래서 (i+k)를 해서 3이 찍힐 거다.
					System.out.printf("%d*%d=%d", (i+k), j, (i+k)*j); 
					// 2단이라면 탭은 한 번.
					if (k < num -1)	System.out.print("\t");
					// k가 num-1과 같아졌으면, 그러니까 탭을 했으면
					else			System.out.println(); 
				}
			}
			// j, k에 대한 반복문을 다 돌고 엔터.
			System.out.println();

		}
	}	

	public static void main(String[] args) {
		// 구구단 클래스의 객체를 생성한다. 생성된 객체는 이름이 gg이다.
		A21Gugudan gg = new A21Gugudan(); 
		// 메서드 호출
		gg.printGugudan(2); 
	}

}
