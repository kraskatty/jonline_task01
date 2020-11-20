package by.jonline.task1.main;

public class Lin3 {
	
	//¬ычислить значение выражени€ по формуле

	public static void main(String[] args) {
		double x;
		double y;
		
		x = 4.5;
		y = 7.2;
		
		double z;
		
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.tan(x * y));
		
		System.out.println("≈сли x = " + x + ", y = " + y + ", то значение выражени€ равно " + z + ".");

	}

}
