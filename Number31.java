package by.jonline.task1.main;

public class Number31 {
	
	// Составить  программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
	// скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки - t2 ч.

	public static void main(String[] args) {
		
		double v;
		double v1;
		double t1;
		double t2;
		
		v = 15.5;
		v1 = 3.4;
		t1 = 0.5;
		t2 = 1.5;
		
		double sGen;
		
		sGen = v * t1 + (v - v1) * t2;
		
		System.out.println("Путь лодки составляет " + sGen + " км.");

	}

}
