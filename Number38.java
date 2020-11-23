package by.jonline.task1.main;

public class Number38 {
	
	//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (x, y)
	//принадлежит закрашенной области, и false - в противном случае.

	public static void main(String[] args) {
		
		double x;
		double y;
		boolean condition;
		
		x = 1;
		y = -4;
		
		//а)
		
		condition = (y <= (x + 4)) && (y <= (-x +4)) && y >= 0;
		
		System.out.println("a) Точка принадлежит закрашенной области - " + condition);
		
		
		//c)
		
		condition = (x >= 0 && y >= 0 && y <= Math.sqrt(16 - x * x)) || (x >= 0 && y <= 0 && x <= Math.sqrt(25 - y * y));
				
		System.out.println("c) Точка принадлежит закрашенной области - " + condition);

	}

}
