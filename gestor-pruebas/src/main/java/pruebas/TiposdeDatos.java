package pruebas;

import java.util.Scanner;

public class TiposdeDatos {

	public static void main(String[] args) {
		
		
		System.out.println("Tipo de datos");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor de a:");
		int a = teclado.nextInt();
		System.out.println("Ingrese el valor de b:");
		int b = teclado.nextInt();
		int suma = a+b;
		
		System.out.println("La suma es:"+ suma);
		
		teclado.close();
	}

}
