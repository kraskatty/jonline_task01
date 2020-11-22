package by.jonline.task1.main;

public class Number14 {
	
	//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

	public static void main(String[] args) {
		
		double r;
		
		r = 34.6;
		
		double length;
		double square;
		
		length = 2 * Math.PI * r;
		System.out.println("Длина окружности равна " + length);
		
		square = Math.PI * r * r;
		System.out.println("Площадь круга равна " + square);

	}

}
