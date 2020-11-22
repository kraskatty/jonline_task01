package by.jonline.task1.main;

public class Lin4 {

	// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой части). Поменять местами дробную и целую 
	//части числа и вывести полученное значение числа.
	
	public static void main(String[] args) {
		double x;
		
		x = 111.222;
		
		int a;
		
		a = (int) x; 
		
		double b;
		
		b = (x * 1000) % 1000; 
				
		double y;
		
		y = b + (((double) a) / 1000);
		
		System.out.println("Было число " + x + " - стало число " + y);

	}

}
