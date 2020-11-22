package by.jonline.task1.main;

public class Number19 {
	
	// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

	public static void main(String[] args) {
		
		double side;
		
		side = 7;
		
		double s;
		double h;
		double rIn; //радиус вписанной окружности
		double rOut; //радиус описанной окружности
		
		double pHalf;
		pHalf = 3 * side / 2;
		
		h = 2 * Math.sqrt(pHalf * (pHalf - side) * 3) / side;
		
		s = h * side / 2;
		System.out.println("Площадь треугольника равна " + s);
		
		System.out.println("Высота треугольника равна " + h);
		
		rIn = side / (2 * Math.sqrt(3));
		System.out.println("Радиус вписанной окружности равен " + rIn);
		
		rOut = side / Math.sqrt(3);
		System.out.println("Радиус описанной окружности равен " + rOut);

	}

}
