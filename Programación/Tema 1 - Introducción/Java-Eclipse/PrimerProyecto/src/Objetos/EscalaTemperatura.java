package Objetos;

public class EscalaTemperatura {
    // Limites inferior y superior para la escala de temperatura en grados Celsius
    final static int limiteInferior = -30;
    final static int limiteSuperior = 100;
    // Incremento en grados Celsius para cada paso en la escala
    final static int incremento = 6;
    
    public static void main(String[] args) {
        // Creamos una instancia de la clase Temperatura
        Temperatura t = new Temperatura();
        // Inicializamos el contador de grados Celsius en el limite inferior
        int gradosC = limiteInferior;
        float gradosF = 0;
        
        // Mientras el contador de grados Celsius no supere el limite superior...
        while(gradosC <= limiteSuperior) {
            // Establecemos la temperatura en grados Celsius en la instancia de Temperatura
            t.setCentigrados(gradosC);
            // Obtenemos la temperatura en grados Fahrenheit de la instancia de Temperatura
            gradosF = t.getFarenheit();
            // Imprimimos la temperatura en ambas escalas
            System.out.printf("%5dºC -> %.1fºF\n", gradosC, gradosF);            
            gradosC += incremento;
        }
    }
}

class Temperatura{
    // Variable para almacenar la temperatura en grados Celsius
    private float gradosCentigrados;
    
    // Método para establecer la temperatura en grados Celsius
    public void setCentigrados(float grados) {
        gradosCentigrados = grados;
    }
    
    // Método para obtener la temperatura en grados Celsius
    public float getCentigrados() {
        return gradosCentigrados;
    }
    
    // Método para obtener la temperatura en grados Fahrenheit
    public float getFarenheit() {
        // Aplicamos la fórmula para convertir grados Celsius a grados Fahrenheit
        return 9/5f * gradosCentigrados + 32;
    }
}
