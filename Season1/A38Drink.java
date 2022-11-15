package original;

// Drinks는 추상 클래스로 정의하고
abstract class Drinks {
	// drink() 라는 추상 메서드를 포함한다.
	abstract void drink();

}


class Juice extends Drinks {
	void drink() {
		System.out.println("Juice.");		
	}
}

class Coffee extends Drinks {	
	void drink() {
		System.out.println("Coffee.");
	}

}

class Beer extends Drinks {	
	void drink() {
		System.out.println("Beer.");
	}

}

class Water extends Drinks {
	void drink() {
		System.out.println("Water.");
	}

}

class Tea extends Drinks {
	void drink() {
		System.out.println("Tea.");
	}	
}

public class A38Drink {
	public static void main(String[] args) {

		// 이들 인스턴스로 구성된 배열을 선언하고
		Drinks[] drinks = new Drinks[5];
		drinks[0] = new Juice();
		drinks[1] = new Coffee();
		drinks[2] = new Beer();
		drinks[3] = new Water();
		
		// drink 메서드를 출력하세요.
		// Juice.drink() 는 “주스를 마십니다.”의 형태로 출력
		
		for (Drinks c : drinks)
			c.drink();
			
	}
}
