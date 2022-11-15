package original;

public class A31Fibonacci {
	public void asdf(int fn) {
		int f0 = 0;
		int f1 = 1;
		
		// 2부터 출발하는 반복문.
		for (int i = 2; i < fn; i++) {
			// 앞 두개를 더한 걸 대입해서
			int sum = f0 + f1;
			// 그거를 바로 출력하고
			System.out.print(sum + " ");
			// 뒤의 걸 앞에 대입한 뒤
			f0 = f1;
			// 그거는 앞에 두개를 더한 변수로 대입한다.
			f1 = sum;
		}
	}
	public static void main(String[] args) {
		A31Fibonacci gg = new A31Fibonacci();
		gg.asdf(11);

	}

}

/*
 * 그러니까 원래 피보나치는 앞 두개의 값을 더해서 다음 값을 뽑아내는 수열이니까
 * 앞 두개의 값을 더한 변수를 하나 설정하고 그걸 뽑은 다음
 * 뒤에 걸 앞에 대입하고
 * 그 뒤의 거는 두개를 더한 값으로 대입된다는 얘기다.
 * */
 