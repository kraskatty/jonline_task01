package by.jonline.task1.main;

public class Vetv2 {
	
	// Найти max {min(a, b), min(c, d)}.

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		a = 123.62;
		b = 873.98;
		c = 47.63;
		d = 187.23;
		
		double maxim;
		
		maxim = Math.max(Math.min(a,  b), Math.min(c, d));
		
		System.out.println("max = " + maxim);
				

	}

}
