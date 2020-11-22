package by.jonline.task1.main;

public class Cykl3 {
	
	//Найти сумму квадратов первых ста чисел

	public static void main(String[] args) {
		
		int a;
		int summa;
		
		a = 1;
		summa = 0;
		
		while (a <= 100) {
			
			summa = summa + (int)(Math.pow(a,  2));
			a = a + 1;
		}
		
		System.out.println("Сумма равна " + summa);

	}

}
