package by.jonline.task1.main;

public class Number07 {
	
	// Дан прямоугольник, ширина которого в 2 раза меньше длины. Найти площадь прямоугольника.

	public static void main(String[] args) {
		
		double sh;
		double dl;
		
		dl = 5.8;
		sh = dl / 2;
		
		double s;
		
		s = dl * sh;
		
		System.out.println("Площадь прямоугольника со сторонами " + dl + " и " + sh + " равна " + s);

	}

}
