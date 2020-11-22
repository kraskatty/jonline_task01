package by.jonline.task1.main;

public class Vetv3 {
	
	// Даны три точки A(x1, y1), B(x2,y2) и C(x3,y3). Определить, будут ли они расположены на одной прямой.

	public static void main(String[] args) {
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		
		x1 = 1;
		y1 = 2.5;
		x2 = 3.7;
		y2 = 4;
		x3 = 5.1;
		y3 = 6;
		
		// Формула линейного уравнения y = a * x + b. Для двух пар точек составляем систему уравнений и находим a и b. Сравниваем их.
		
		double a1;
		double a2;
		double b1;
		double b2;
		
		a1 = (y2 - y1) / (x2 - x1); 
		b1 = y1 - a1 * x1; // для точек A и B
		a2 = (y3 - y2) / (x3 - x2);
		b2 = y2 - a2 * x2;// для точек В и С
		
		if ((a1 == a2) && (b1 == b2)) {
			System.out.println("Три точки расположены на одной прямой.");
		} else {
			System.out.println("Три точки не расположены на одной прямой.");
		}
		
	}

}
