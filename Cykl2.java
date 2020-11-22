package by.jonline.task1.main;

public class Cykl2 {
	
	// Вычислить значения функции на отрезке [a, b] с шагом h

	public static void main(String[] args) {
		
		double a;
		double b;
		double h;
		double x;
		double y;
		
		a = -5;
		b = 10;
		h = 1.5;
		
		x = Math.min(a, b);
		
		while (x <= Math.max(a, b)) {
			
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			
			System.out.println("При x = " + x + "значение функции y = " + y);
			
			x = x + Math.abs(h);
		}

	}

}
