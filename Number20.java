package by.jonline.task1.main;

public class Number20 {
	
	// Известна длина окружности. Найти площадь круга, ограниченной этой окружностью.

	public static void main(String[] args) {
		
		double length;
		
		length = 31;
		
		double square;
		double radius;
		
		radius = length / ( 2 * Math.PI); //радиус окружности
		
		square = Math.PI * Math.pow(radius, 2); //площадь круга
		
		System.out.println("Площадь круга равна " + square);

	}

}
