package boletin1.ejercicio1;

public class PrincipalPunto {
	
	public static void main(String[] args) {
		
		Punto coordenada1 = new Punto();
		Punto coordenada2 = new Punto();
		Punto coordenada3 = new Punto();
		
		coordenada1.x= 5;
		coordenada1.y=0;
		
		coordenada2.x=10;
		coordenada2.y=10;
		
		coordenada3.x=-3;
		coordenada3.y= 7;
		
		
		System.out.println("Punto 1: ("+coordenada1.x + " , "+coordenada1.y+ ")");
		System.out.println("Punto 2: ("+coordenada2.x + " , "+coordenada2.y+ ")");
		System.out.println("Punto 3: ("+coordenada3.x + " , "+coordenada3.y+ ")");
		
		
		coordenada1.x*= 5;
		coordenada1.y=0;
		
		coordenada2.x+=10;
		coordenada2.y=10;
		
		coordenada3.x=-3;
		coordenada3.y=+ 7;
		
		
		System.out.println("Punto 1: ("+coordenada1.x + " , "+coordenada1.y+ ")");
		System.out.println("Punto 2: ("+coordenada2.x + " , "+coordenada2.y+ ")");
		System.out.println("Punto 3: ("+coordenada3.x + " , "+coordenada3.y+ ")");
		
	}

}
