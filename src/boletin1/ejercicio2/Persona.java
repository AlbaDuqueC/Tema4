package boletin1.ejercicio2;

public class Persona {

	String dni;
	String nombre;
	String apellido;
	int edad;
	
	
	public Persona(String dni , String nombre , String apellido , int edad) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.apellido= apellido;
		
		if(edad>0) {
		this.edad=edad;
		}
		
		
	}
	
}
