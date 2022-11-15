// 필드로 쓸 수 있는 것들.
// 가격 : 1280 만원 
// 연료 : LPG, 가솔린
// 연비 : x km/l
// 출력 : x hp

// 메서드로 쓸 수 있는 것들.
/* honk() {
	"Beep, Beep!"
	hipass() {
	"통행료 a원이 결제되었습니다."
	int a = (int) Math.floor(Math.random()*1000) * 10;
	System.out.println(a);
*/

package original;

abstract class Vehicle {
	int fee = (int) Math.floor(Math.random()*1000) * 10;
	String sound = "Beep, beep!";
	String fuel[] = {"LPG", "가솔린"};
	String inform = String.format("통행료 %d원이 결제되었습니다.", fee);
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
