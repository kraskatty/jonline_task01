package by.jonline.task1.main;

public class Number23 {
	
	// Найти площадь кольца, внутренний радиус которого равен r, а внешний R (R > r).

	public static void main(String[] args) {
		
		double rIn;
		double rOut;
		
		rIn = 25;
		rOut = 36;
		
		double sRing;
		
		sRing = Math.PI * (Math.pow(rOut, 2) - Math.pow(rIn, 2));
		
		System.out.println("Площадь кольца равна " + sRing);

	}

}
