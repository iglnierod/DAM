import java.util.Random;
public class Aleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		//System.out.println(random.nextDouble());
		
		System.out.println(Math.round(Math.random()*10));
		
		System.out.println((int)(Math.random()*10)+5);
	}

}
