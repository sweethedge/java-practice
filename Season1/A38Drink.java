package original;

// Drinks�� �߻� Ŭ������ �����ϰ�
abstract class Drinks {
	// drink() ��� �߻� �޼��带 �����Ѵ�.
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

		// �̵� �ν��Ͻ��� ������ �迭�� �����ϰ�
		Drinks[] drinks = new Drinks[5];
		drinks[0] = new Juice();
		drinks[1] = new Coffee();
		drinks[2] = new Beer();
		drinks[3] = new Water();
		
		// drink �޼��带 ����ϼ���.
		// Juice.drink() �� ���ֽ��� ���ʴϴ�.���� ���·� ���
		
		for (Drinks c : drinks)
			c.drink();
			
	}
}
