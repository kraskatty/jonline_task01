package by.jonline.task1.main;

public class Lin1 {

	//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
	
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		a = 1.2;
		b = -3;
		c = 4.5;
		
		double z;
		
		//находим значение
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.println("Если a = " + a + ", b = " + b + ", c = " + c + ", то z = " + z);

	}

}
