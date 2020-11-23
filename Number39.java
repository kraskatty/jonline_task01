package by.jonline.task1.main;

public class Number39 {
	
	//Дано действительное число x. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, 
	//вычислите за минимальное число операций: 2x4 - 3x3 + 4x2 - 5x + 6.

	public static void main(String[] args) {
		
		double x;
		
		x = 1.6;
		
		double x2;
		double rez;
		
		//x2 * (2x2 - 3x + 4) - 5x + 6
		
		x2 = x * x;
		
		rez = x2 * (2 * x2 - 3 * x + 4) - 5 * x + 6;
		
		System.out.println("Значение выражения равно " + rez);
		
	}

}
