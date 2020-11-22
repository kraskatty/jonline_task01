package by.jonline.task1.main;

public class Vetv4 {
	
	// Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича. Определить, проудет ли кирпич через отверстие.

	public static void main(String[] args) {
		
		double a;
		double b;
		double x;
		double y;
		double z;
		
		a = 25;
		b = 32;
		x = 7.1;
		y = 10.5;
		z = 20;
		
		if ((a > y && b > x) || (a > x && b > y) || (a > x && b > z) || (a > z && b > x) || (a > y && b > z) || (a > z && b > y)) {
			
			System.out.println("Кирпич пройдет через отверстие.");
		
		} else {
			
			System.out.println("Кирпич не пройдет через отверстие.");
		}
		

	}

}
