package by.jonline.task1.main;

public class Number18 {
	
	// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

	public static void main(String[] args) {
		
		double a;
		
		a = 3;
		
		double sSide;
		double sCube;
		double vCube;
		
		sSide = Math.pow(a,  2);
		System.out.println("Площадь грани куба равна " + sSide);
		
		sCube = 6 * sSide;
		System.out.println("Площадь куба равна " + sCube);
		
		vCube = Math.pow(a,  3);
		System.out.println("Объем куба равен " + vCube);

	}

}
