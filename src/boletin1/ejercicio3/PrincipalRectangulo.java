package boletin1.ejercicio3;

import java.util.Scanner;

public class PrincipalRectangulo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		Rectangulo R1;
		Rectangulo R2;
		
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		
		System.out.println("Introduzca las coodenadas de R1:");
		System.out.print("x1 = ");
		x1= sc.nextInt();
		System.out.print("y1 = ");
		y1=sc.nextInt();
		System.out.print("x2 = ");
		x2=sc.nextInt();
		System.out.print("y2 = ");
		y2=sc.nextInt();
		
		R1= new Rectangulo(x1, y1, x2, y2);
		
		System.out.println("Introduzca las coodenadas de R2:");
		System.out.print("x1 = ");
		x1= sc.nextInt();
		System.out.print("y1 = ");
		y1=sc.nextInt();
		System.out.print("x2 = ");
		x2=sc.nextInt();
		System.out.print("y2 = ");
		y2=sc.nextInt();

		R2= new Rectangulo(x1, y1, x2, y2);
		
		
		System.out.println("Rectagulo 1: (" + R1.x1 + " , " + R1.y1 + ") (" +  R1.x2 + " , " + R1.y2 + ")");
		System.out.println("Rectagulo 2: (" + R2.x1 + " , " + R2.y1 + ") (" +  R2.x2 + " , " + R2.y2 + ")");
		
		System.out.println("Perimetro 1 = " + Math.abs((R1.x2-R1.x1 + R1.y2-R1.y1)*2) );
		System.out.println("Perimetro 2 = " + Math.abs((R2.x2-R2.x1 + R2.y2-R2.y1)*2) );
		
		System.out.println("Area 1 = " + Math.abs(R1.x2-R1.x1)*Math.abs( R1.y2-R1.y1) );
		System.out.println("Area 1 = " + Math.abs(R2.x2-R2.x1)*Math.abs( R2.y2-R2.y1) );
		
		System.out.println();
		System.out.println("Modificaciones");
		
		R1.x1+=4;
		R1.y1+=0;
		R1.x2-=5;
		R1.y2*=2;
		
		R2.x1+=7;
		R2.y1-=2;
		R2.x2-=2;
		R2.y2*=3;
		
		System.out.println("Rectagulo 1: (" + R1.x1 + " , " + R1.y1 + ") (" +  R1.x2 + " , " + R1.y2 + ")");
		System.out.println("Rectagulo 2: (" + R2.x1 + " , " + R2.y1 + ") (" +  R2.x2 + " , " + R2.y2 + ")");
		
		System.out.println("Perimetro 1 = " + Math.abs((R1.x2-R1.x1 + R1.y2-R1.y1)*2) );
		System.out.println("Perimetro 2 = " + Math.abs((R2.x2-R2.x1 + R2.y2-R2.y1)*2) );
		
		System.out.println("Area 1 = " + Math.abs(R1.x2-R1.x1)*Math.abs( R1.y2-R1.y1) );
		System.out.println("Area 1 = " + Math.abs(R2.x2-R2.x1)*Math.abs( R2.y2-R2.y1) );
		
	}

}
