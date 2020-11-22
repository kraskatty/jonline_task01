package by.jonline.task1.main;

public class Number25 {
	
	//  Вычислить корни квадратного уравнения ax2 + bx + c = 0 с заданными коэффициентами a, b и c (предполагается, что а!=0 и что дискриминант уравнения неотрицателен).

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = 3;
		b = -4;
		c = 1;
		
		double x1;
		double x2;
		double diskr;
		
		diskr = b * b - 4 * a * c;
		
		if (diskr == 0) {
			
			x1 = (-b + Math.sqrt(diskr)) / (2 * a);
			
			System.out.println("Уравнение имеет один корень x = " + x1);
		}
		
		if (diskr > 0) {
			
			x1 = (-b - Math.sqrt(diskr)) / (2 * a);
			
			x2 = (-b + Math.sqrt(diskr)) / (2 * a);
			
			System.out.println("Уравнение имеет корни x1 = " + x1 + " и x2 = " + x2);
		}
		
		if (diskr < 0) {
			
			System.out.println("Уравнение не имеет корней");
		}

	}

}
