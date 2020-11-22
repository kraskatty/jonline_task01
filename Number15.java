package by.jonline.task1.main;

public class Number15 {
	
	// Написать программу, которая выводит на экран первые четыре степени числа ПИ.

	public static void main(String[] args) {
		
		int n;
		double rez;
		
		n = 1;
		
		while (n <= 4) {
			
			rez = Math.pow(Math.PI, n);
			System.out.println("Число PI в степени " + n + " равно " + rez);
			n = n + 1;
		}
		

	}

}
