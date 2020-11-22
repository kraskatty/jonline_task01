package by.jonline.task1.main;

public class Number12 {
	
	//Вычислить расстотяние между точками с заданными координатами (x1;y1) и (x2;y2).

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double y1;
		double y2;
		
		x1 = -2;
		x2 = 2;
		y1 = 3;
		y2 = -3;
		
		double rasst;
		
		rasst = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
		
		System.out.println("Расстояние равно " + rasst);

	}

}
