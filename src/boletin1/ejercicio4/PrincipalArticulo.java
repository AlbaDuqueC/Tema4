package boletin1.ejercicio4;

import java.util.Scanner;

public class PrincipalArticulo {
	
	public static void main(String[] args) {
		
		Articulo art;
		
		Scanner sc= new Scanner(System.in);
		
		
		String nombre= "";
		double precio= 0;
		int cuantosQuedan= 0;
		int IVA=21;
		
		System.out.println("Nombre del producto:");
		nombre= sc.next();
		
		System.out.println("Precio del producto:");
		precio= sc.nextDouble();
		
		System.out.println("Cuantos productos quieres que queden:");
		cuantosQuedan= sc.nextInt();
		
		
		art= new Articulo(nombre, precio, cuantosQuedan, IVA);
		
		System.out.println(art.nombre+" - Precio: "+ art.precio + "€ - IVA: "+ art.IVA + "% - PVP: " + ((art.precio * (art.IVA *0.01)) + art.precio) + "€");
		
		art.precio= 12;
		System.out.println(art.nombre+" - Precio: "+ art.precio + "€ - IVA: "+ art.IVA + "% - PVP: " + ((art.precio * (art.IVA *0.01)) + art.precio) + "€");
		
		
	}

}
