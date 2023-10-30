package ejercicio1;

import java.util.Scanner;

//Ejercicio 1 Java.- Array con 30 ventas del mes, y que diga cuáles y cuántas son mayores que $2000.
public class Ejercicio1 {

    public static void main(String[] args) {

        double ventas[] = new double[30];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las ventas del mes: ");

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1));
            ventas[i] = teclado.nextDouble();
        }

        int k = 0;
        int total = 0;
        System.out.println("Ventas mayores o igual a 2000:");
        while (k < 30) {
            if (ventas[k] >= 2000) {
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        
        System.out.println("El total de ventas mayores a 2000 es " + total);
    }
}
