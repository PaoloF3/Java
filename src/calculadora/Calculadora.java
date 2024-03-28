/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Calculadora{
    
    public static void main(String[] args) {
        double num1, num2;
        Scanner leer = new Scanner(System.in);

        System.out.println("CALCULADORA");

        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextDouble();

        do{
            System.out.println("Ingrese el segundo numero, debe ser distinto que 0: ");
            num2 = leer.nextDouble();
        } while (num2 == 0);
        
        Funciones operacion = new Funciones(num1, num2);
        double suma = operacion.getSuma();
        double resta = operacion.getResta();
        double producto = operacion.getProducto();
        double division = operacion.getDivision();
        double resto = operacion.getResto();
        
        int opcion;
        do {
            System.out.println("MENU, SELECCIONE UNA OPCION");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. PRODUCTO");
            System.out.println("4. DIVISION");
            System.out.println("5. RESTO");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es :" + suma);
                    break;
                case 2:
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    System.out.println("El producto es: " + producto);
                    break;
                case 4:
                    System.out.println("La division es: " + division);
                    break;
                case 5:
                    System.out.println("El resto es: " + resto);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

            System.out.println("¿Desea hacer otra funcion?");
            System.out.println("(1: SI / 2: NO)");
        } while (leer.nextInt() == 1);

        System.out.println("Cerrando calculadora");
        leer.close();
    }
}
