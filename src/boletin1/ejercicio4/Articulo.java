package boletin1.ejercicio4;

public class Articulo {
	
	String nombre;
	double precio;
	int IVA= 21;
	int cuantosQuedan ;
	
	public Articulo(String nombre, double precio, int IVA, int cuantosQuedan) {
		
		this.nombre=nombre;
		
		if(precio>0) {
			
		this.precio=precio;
		
		}
		
		if(IVA==21) {
			
		this.IVA=IVA;
		}
		
		if(precio>=0) {
			
		this.cuantosQuedan=cuantosQuedan;
		}
		
	}

}
