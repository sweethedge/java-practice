package original;

class Food {
	// �ʵ� ����.
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
		Food gg = new Food("ġŲ" , 18000);
		System.out.println(gg);
		System.out.println(gg);
	}
}
