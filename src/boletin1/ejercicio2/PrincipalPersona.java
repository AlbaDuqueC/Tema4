package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		Persona per1;
		Persona per2 = new Persona("7374213J","Alfonso", "García Perez" , 31 );
		
		Scanner sc= new Scanner(System.in);
		
		String dni;
		String nombre;
		String apellido;
		int edad;
		
		System.out.println("Persona 1:");
		System.out.println("dni:");
		dni= sc.next();
		System.out.println("nombre:");
		nombre= sc.next();
		System.out.println("apellido:");
		apellido = sc.next();
		System.out.println("edad:");
		edad= sc.nextInt();
		
		per1= new Persona(dni, nombre , apellido , edad);
		
		
		System.out.println("Persona 2:");
		System.out.println("dni:");
		dni= sc.next();
		System.out.println("nombre:");
		nombre= sc.next();
		System.out.println("apellido:");
		apellido = sc.next();
		System.out.println("edad:");
		edad= sc.nextInt();
		
		per2= new Persona(dni, nombre , apellido , edad);
		
		
		if(per1.edad>per2.edad) {
			System.out.println(per1.nombre+" " + per1.apellido + " con dni " + per1.dni + " es mayor que "+ per2.nombre+" " + per2.apellido + " con dni " + per2.dni );
		}else if (per1.edad<per2.edad) {
			System.out.println(per1.nombre+" " + per1.apellido + " con dni " + per1.dni + " es menor que "+ per2.nombre+" " + per2.apellido + " con dni " + per2.dni );		
		}else {
			System.out.println(per1.nombre+" " + per1.apellido + " con dni " + per1.dni + " es de la misma edad que "+ per2.nombre+" " + per2.apellido + " con dni " + per2.dni );
		}
	}

}
