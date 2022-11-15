// �ʵ�� �� �� �ִ� �͵�.
// ���� : 1280 ���� 
// ���� : LPG, ���ָ�
// ���� : x km/l
// ��� : x hp

// �޼���� �� �� �ִ� �͵�.
/* honk() {
	"Beep, Beep!"
	hipass() {
	"����� a���� �����Ǿ����ϴ�."
	int a = (int) Math.floor(Math.random()*1000) * 10;
	System.out.println(a);
*/

package original;

abstract class Vehicle {
	int fee = (int) Math.floor(Math.random()*1000) * 10;
	String sound = "Beep, beep!";
	String fuel[] = {"LPG", "���ָ�"};
	String inform = String.format("����� %d���� �����Ǿ����ϴ�.", fee);
	abstract void honk();
	abstract void hipass();
}

class Sedan extends Vehicle {
	void honk() {
		System.out.println(sound);
	}

	void hipass() {
		System.out.println(inform);
	}
}

class Truck extends Vehicle {

	@Override
	void honk() {
		System.out.println(sound);
		
	}

	@Override
	void hipass() {
		System.out.println(inform);
		
	}
	
}

public class A39Car {
	public static void main(String[] args) {
		Vehicle[] vehicle = new Vehicle[2];
		vehicle[0] = new Sedan();
		vehicle[1] = new Truck();
		
		for (Vehicle c : vehicle) {
			c.honk();
			c.hipass();
			System.out.println("*".repeat(50));
		}
		
	}

}
