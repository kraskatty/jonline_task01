package by.jonline.task1.main;

public class Lin6 {
	
	// Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y) принадлежит закрашенной области, и false - в противном случае.
	// Если -4 < x < 4, то -3 < y < 0   и если -2 < x < 2, то 0 < y < 4

	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = -1.9;
		y = 2.6;
		
		boolean zakrOblast;
				
		zakrOblast = ((y < 0) && (y > -3) && (x > -4) && (x < 4)) || ((y > 0) && (y < 4) && (x > -2) && (x < 2));
		
		System.out.println(zakrOblast);

	}

}
