package by.jonline.task1.main;

public class Vetv5 {
	
	// Вычислить значение функции

	public static void main(String[] args) {
		
		double x;
		double fx;
		
		x = 4.5;
		
		if (x <= 3) {
			
			fx = Math.pow(x, 2) - 3 * x + 9;
			
		} else {
			
			fx = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println("Значение функции f(x) = " + fx);

	}

}
