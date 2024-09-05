package ar.com.morga;

import java.util.Scanner;

public class InterfazCalculadora {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n \n**Menú de operaciones matemáticas**");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if(opcion > 5)
            	break;
            
            double num1, num2, resultado;
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();
            


            switch (opcion) {
                case 1:
                    resultado = Suma.sumar(num1, num2);
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 2:
                    resultado = Resta.restar(num1, num2);
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 3:
                    resultado = Producto.producto(num1, num2);
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 4:
                    resultado = Division.divisionEntera(num1, num2);
                    System.out.println("La división de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

	}

}
