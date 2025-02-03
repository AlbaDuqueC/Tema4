package boletin1.ejercicio3;

public class PrincipalRectangulo {
	
	public static void main(String[] args) {
		
		Rectangulo R1= new Rectangulo();
		Rectangulo R2= new Rectangulo();
		
		R1.x1=0;
		R1.y1=0;
		R1.x2=5;
		R1.y2=5;
		
		R2.x1=7;
		R2.y1=9;
		R2.x2=2;
		R2.y2=3;
		
		System.out.println("Rectagulo 1: (" + R1.x1 + " , " + R1.y1 + ") (" +  R1.x2 + " , " + R1.y2 + ")");
		System.out.println("Rectagulo 2: (" + R2.x1 + " , " + R2.y1 + ") (" +  R2.x2 + " , " + R2.y2 + ")");
		
		System.out.println("Perimetro 1 = " + Math.abs((R1.x2-R1.x1 + R1.y2-R1.y1)*2) );
		System.out.println("Perimetro 2 = " + Math.abs((R2.x2-R2.x1 + R2.y2-R2.y1)*2) );
		
		System.out.println("Area 1 = " + Math.abs(R1.x2-R1.x1)*Math.abs( R1.y2-R1.y1) );
		System.out.println("Area 1 = " + Math.abs(R2.x2-R2.x1)*Math.abs( R2.y2-R2.y1) );
		
		R1.x1+=4;
		R1.y1=0;
		R1.x2=5;
		R1.y2*=2;
		
		R2.x1=7;
		R2.y1-=2;
		R2.x2=2;
		R2.y2*=3;
		
		System.out.println("Rectagulo 1: (" + R1.x1 + " , " + R1.y1 + ") (" +  R1.x2 + " , " + R1.y2 + ")");
		System.out.println("Rectagulo 2: (" + R2.x1 + " , " + R2.y1 + ") (" +  R2.x2 + " , " + R2.y2 + ")");
		
		System.out.println("Perimetro 1 = " + Math.abs((R1.x2-R1.x1 + R1.y2-R1.y1)*2) );
		System.out.println("Perimetro 2 = " + Math.abs((R2.x2-R2.x1 + R2.y2-R2.y1)*2) );
		
		System.out.println("Area 1 = " + Math.abs(R1.x2-R1.x1)*Math.abs( R1.y2-R1.y1) );
		System.out.println("Area 1 = " + Math.abs(R2.x2-R2.x1)*Math.abs( R2.y2-R2.y1) );
		
	}

}
