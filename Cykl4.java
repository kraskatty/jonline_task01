package by.jonline.task1.main;

public class Cykl4 {
	
	// Составить программу нахождения произведения квадратов первых двухсот чисел.

	public static void main(String[] args) {
		
		double a;
		double proizv;
		
		a = 1;
		proizv = 1;
		
		while (a <= 200) {
			
			proizv = proizv * Math.pow(a,  2);
			a = a + 1;
			
			System.out.println(a + "   " + proizv);
		}
		
		System.out.println("Произведение равно " + proizv);


	}

}
