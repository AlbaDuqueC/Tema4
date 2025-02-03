package boletin1.ejercicio2;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		Persona per1= new Persona();
		Persona per2 = new Persona();
		
		per1.dni="1234456M";
		per1.apellido= "Luján García";
		per1.nombre= "Federico";
		per1.edad=23;
		
		per2.dni="7374213J";
		per2.nombre="Alfonso";
		per2.apellido="García Perez";
		per2.edad=31;
		
		if(per1.edad>per2.edad) {
			System.out.println(per1.nombre+" " + per1.apellido + " con dni " + per1.dni + " es mayor que "+ per2.nombre+" " + per2.apellido + " con dni " + per2.dni );
		}else if (per1.edad<per2.edad) {
			System.out.println(per1.nombre+" " + per1.apellido + " con dni " + per1.dni + " es menor que "+ per2.nombre+" " + per2.apellido + " con dni " + per2.dni );		
		}else {
			System.out.println(per1.nombre+" " + per1.apellido + " con dni " + per1.dni + " es de la misma edad que "+ per2.nombre+" " + per2.apellido + " con dni " + per2.dni );
		}
	}

}
