package by.jonline.task1.main;

public class Number17 {
	
	// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		num1 = 2;
		num2 = -3;
		
		double srArifm;
		double srGeom;
		
		srArifm = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
		
		System.out.println("Среднее арифметическое равно " + srArifm);
		
		srGeom = Math.sqrt(Math.abs(num1) * Math.abs(num2));
		
		System.out.println("Среднее геометрическое равно " + srGeom);
		

	}

}
