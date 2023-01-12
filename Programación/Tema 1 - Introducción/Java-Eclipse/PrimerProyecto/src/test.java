import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int filas, num = 1;
        System.out.print("Introduce el número de líneas del triángulo de Floyd: ");
        Scanner sc = new Scanner(System.in);
        filas = sc.nextInt();
		sc.close();
        for(int i=1; i<=filas; i++){
            for(int j=1; j<=i; j++){
                System.out.print("\t" + num);
                num++;
            }
            System.out.println();
        }
	}

}
