
public class Cortocircuito {
	public static void main(String[] args) {
		int p = 0;
		int f = 2;

		if ((p > 0) || (++f > 0)) {
			p++;
		}
		System.out.println("p = " + p + " / f = " + f);
	}
}
