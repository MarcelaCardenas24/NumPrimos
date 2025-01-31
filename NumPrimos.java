package numprimos;

import java.util.Scanner;

public class NumPrimos {


    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el valor de x: ");
    int x = sc.nextInt();


    System.out.println("Ingrese el valor de y: ");
    int y = sc.nextInt();
        
    encontrarNumerosPrimos(x, y);
    }
    
        public static void encontrarNumerosPrimos(int x, int y) {
        if (x < y) {
            System.out.println("Numeros primos en el rango de " + x + " a " + y + ":");
            for (int i = x; i <= y; i++) {
                if (esPrimo(i)) {
                    System.out.println(i + " ");
                }
            }
        } else {
            System.out.println("El valor de x debe ser inferior a y.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
