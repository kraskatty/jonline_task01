package by.jonline.task1.main;

public class Number30 {
	
	// Три сопротивления R1, R2 и R3 соединены параллельно. Найдите сопротивление соединения.

	public static void main(String[] args) {
		
		double r1;
		double r2;
		double r3;
		
		r1 = 35;
		r2 = 17.5;
		r3 = 41.25;
		
		double rGen;
		
		rGen = (r1 * r2* r3) / (r1 * r2 + r2 * r3 + r1 * r3);
		
		System.out.println("Сопротивление соединения равно " + rGen);

	}

}
