package by.jonline.task1.main;

public class Number28 {
	
	//Составить программу перевода радианной меры угла в градусы, минуты и секунды.

	public static void main(String[] args) {
		
		double angleRad;
		
		angleRad = 1; // радиан
		
		double angleGrad;
		int grad;
		int min;
		int sec;
		
		angleGrad = Math.toDegrees(angleRad);
		
		grad = (int) angleGrad;
		
		angleGrad = angleGrad - grad;
		
		min = (int) (angleGrad * 60);
		
		sec = (int) ((angleGrad * 60 - min) * 60);
		
		System.out.println(angleRad + " радиан - это " + grad + " град " + min + " мин " + sec + " сек");

	}

}
