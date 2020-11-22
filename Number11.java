package by.jonline.task1.main;

public class Number11 {
	
	// Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов.

	public static void main(String[] args) {
		
		double a;
		double b;
		
		double c;
		double p;
		double s;
		
		a = 3;
		b = 4;
		
		c = Math.sqrt(a * a + b * b); //гипотенуза
		p = a + b + c; //периметр
		s = a * b / 2; //площадь
		
		System.out.println("Периметр треугольника равен " + p);
		System.out.println("Площадь треугольника равна " + s);

	}

}
