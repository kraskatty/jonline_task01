package by.jonline.task1.main;

public class Number29 {
	
	// Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c.

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = 5;
		b = 2.9;
		c = 7.2;
		
		double angABrad;
		double angBCrad;
		double angCArad;
		
		double angABgrad;
		double angBCgrad;
		double angCAgrad;
		
		angABrad = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		angBCrad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		angCArad = Math.acos((c * c + a * a - b * b) / (2 * c * a));
		
		angABgrad = Math.toDegrees(angABrad);
		angBCgrad = Math.toDegrees(angBCrad);
		angCAgrad = Math.toDegrees(angCArad);
		
		System.out.println("Угол между сторонами a и b равен " + angABrad + " рад, или " + angABgrad + " град.");
		System.out.println("Угол между сторонами b и c равен " + angBCrad + " рад, или " + angBCgrad + " град.");
		System.out.println("Угол между сторонами c и a равен " + angCArad + " рад, или " + angCAgrad + " град.");
		
		
		

	}

}
