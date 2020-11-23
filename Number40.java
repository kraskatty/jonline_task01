package by.jonline.task1.main;

public class Number40 {
	
	//Дано значение x. Получить значения -2x + 3x2 - 4x3 и 1 + 2x + 3x2 + 4x3. Позаботьтесь об экономии операции.

	public static void main(String[] args) {
		
		double x;
		
		x = 5.5;
		
		double rez1;
		double rez2;
		double x2;
		
		x2 = x * x;
		
		rez1 = - x * (4 * x2 - 3 * x + 2);
		rez2 = x2 * (4 * x + 3) + 1 + 2 * x;
		
		System.out.println("Значение первого выражения равно " + rez1);
		System.out.println("Значение второго выражения равно " + rez2);
		
	}

}
