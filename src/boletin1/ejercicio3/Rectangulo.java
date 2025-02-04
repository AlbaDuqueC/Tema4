package boletin1.ejercicio3;

public class Rectangulo {

	int x1;
	int y1;
	int x2;
	int y2;

	public Rectangulo(int x1, int y1, int x2, int y2) {

		if (x2 > x1 && y2 > y1 ) {

			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;

		}

	}

}
