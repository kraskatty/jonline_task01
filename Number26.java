package by.jonline.task1.main;

public class Number26 {
	
	// Найти площадь треугольника, две стороны которого равны a и b, а угол между этими сторонами y.

	public static void main(String[] args) {
		
		double a;
		double b;
		double angle; //в градусах
		
		a = 4;
		b = 7;
		angle = 35;
		
		angle = Math.toRadians(angle);
		
		double h;
		double s;
		
		h = a * Math.sin(angle);
		
		s = b * h / 2;
		
		System.out.println("Площадь треугольника равна " + s);

	}

}
