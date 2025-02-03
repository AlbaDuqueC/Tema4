package boletin1.ejercicio4;

public class PrincipalArticulo {
	
	public static void main(String[] args) {
		
		Articulo art = new Articulo ();
		
		art.nombre= "Pijama";
		art.precio= 14;
		art.cuantosQuedan= 5;
		
		System.out.println(art.nombre+" - Precio: "+ art.precio + "€ - IVA: "+ art.IVA + "% - PVP: " + ((art.precio * (art.IVA *0.01)) + art.precio) + "€");
		
		art.precio= 12;
		System.out.println(art.nombre+" - Precio: "+ art.precio + "€ - IVA: "+ art.IVA + "% - PVP: " + ((art.precio * (art.IVA *0.01)) + art.precio) + "€");
		
		
	}

}
