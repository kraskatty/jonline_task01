package by.jonline.task1.main;

public class Lin4 {

	// ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
	//дробную и целую части числа и вывести полученное значение числа.
	
	public static void main(String[] args) {
		double x;
		
		x = 111.222;
		
		int a;
		
		a = (int) x; //получаем целое число
		
		double b;
		
		b = (x * 1000) % 1000; //целое число
				
		double y;
		
		y = b + (((double) a) / 1000);
		
		System.out.println("Ѕыло число " + x + " - стало число " + y);

	}

}
