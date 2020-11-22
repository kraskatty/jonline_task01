package by.jonline.task1.main;

public class Number09 {
	
	// Вычислить значение выражения по формуле

	public static void main(String[] args) {
		
		double a = 2.5;
		double b = 3.0;
		double c = -1.5;
		double d = 0.5;
		
		double rez;
		
		rez = (a / c) * (b / d) - (a * b - c) / (c * d);
		
		System.out.println("Значение выражения равно " + rez);

	}

}
