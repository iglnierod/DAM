package factorial;

public class Factorial { 
    public int factorial_bucle(int n) throws Exception { 
        if (n < 0) { 
            throw new Exception("Erro. O número ten que ser >=0"); 
        }
        int resultado = 1; 
        for (int i = 2; i <= n; i++) { 
            resultado *= i; 
        } 
        return resultado; 
    }
    public int factorial_recursivo(int n) throws Exception {
        if (n < 0) { 
            throw new Exception("Erro. O número ten que ser >=0"); 
        }
        if(n == 0) {
            return 1;
        }
        else {
            return n*factorial_recursivo(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        // Recursivo
        try {
            System.out.println(f.factorial_recursivo(20));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Con bucle
        try {
            System.out.println(f.factorial_bucle(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
} 
