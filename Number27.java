package by.jonline.task1.main;

public class Number27 {
	
	// Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.

	public static void main(String[] args) {
		
		double a;
		
		a = 2;
		
		double a8;
		double a10;
		double a2;
		double a4;
		
		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		
		System.out.println("Значение числа а в степени 8 равно " + a8);
		
		a10 = a8 * a2;
		
		System.out.println("Значение числа а в степени 10 равно " + a10);
		

	}

}
