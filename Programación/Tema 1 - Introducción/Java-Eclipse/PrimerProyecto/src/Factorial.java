
public class Factorial {

	public static int calcular(int n) {
		int res = 1;
		for (int i = n; i > 0; i--) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Factorial.calcular(5));
	}

}
