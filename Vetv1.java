package by.jonline.task1.main;

public class Vetv1 {
	
	// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

	public static void main(String[] args) {
		
		double ugol1;
		double ugol2;
		
		ugol1 = 45;
		ugol2 = 45;
		
		// Сумма трех углов треугольника равна 180 град.
		
		if ((180 - ugol1 - ugol2) > 0) {
			
			System.out.println("Треугольник существует");
			
			if ((ugol1 == 90) || (ugol2 == 90) || (ugol1 + ugol2 == 90))
				
				System.out.println("Треугольник прямоугольный");
			
		} else 
				
			System.out.println("Такого треугольника не существует");
			
		
	}

}
