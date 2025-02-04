package boletin1.ejercicio1;

import java.util.Scanner;

public class PrincipalPunto {
	
	public static void main(String[] args) {
		
		Punto coordenada1;
		Punto coordenada2;
		Punto coordenada3;
		
		int x;
		int y;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Punto 1:");
		System.out.println("x = ");	
		x=sc.nextInt();
		System.out.println("y = ");
		y=sc.nextInt();
		coordenada1 = new Punto(x,y);
		
		System.out.println("Punto 2:");
		System.out.println("x = ");	
		x=sc.nextInt();
		System.out.println("y = ");
		y=sc.nextInt();
		coordenada2 = new Punto(x,y);
		
		System.out.println("Punto 3:");
		System.out.println("x = ");	
		x=sc.nextInt();
		System.out.println("y = ");
		y=sc.nextInt();
		coordenada3 = new Punto(x,y);
		
		
		
		
		System.out.println("Punto 1: ("+coordenada1.x + " , "+coordenada1.y+ ")");
		System.out.println("Punto 2: ("+coordenada2.x + " , "+coordenada2.y+ ")");
		System.out.println("Punto 3: ("+coordenada3.x + " , "+coordenada3.y+ ")");
		
		
		coordenada1.x*= 5;
		coordenada1.y-=0;
		
		coordenada2.x+=10;
		coordenada2.y-=10;
		
		coordenada3.x-=-3;
		coordenada3.y=+ 7;
		
		
		System.out.println("Punto 1: ("+coordenada1.x + " , "+coordenada1.y+ ")");
		System.out.println("Punto 2: ("+coordenada2.x + " , "+coordenada2.y+ ")");
		System.out.println("Punto 3: ("+coordenada3.x + " , "+coordenada3.y+ ")");
		
	}

}
