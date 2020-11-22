package by.jonline.task1.main;

public class Number24 {
	
	// Найти площадь равнобедренной трапеции с основаниями a и b и углом АЛЬФА при большем основании a.

	public static void main(String[] args) {
		
		double a;
		double b;
		double alfa;
		
		a = 7;
		b = 3;
		alfa = 30;
		
		double s;
		double h;
		
		alfa = Math.toRadians(alfa);
		h = ((a - b) / 2) * Math.tan(alfa);
		s = h * a;
		
		System.out.println("Площадь трапеции равна " + s);

	}

}
