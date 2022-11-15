package original;

class Food {
	// 필드 선언.
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}

}

public class A36Food {

	public static void main(String[] args) {
		Food gg = new Food("치킨" , 18000);
		System.out.println(gg);
		System.out.println(gg);
	}
}
