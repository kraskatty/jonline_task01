package by.jonline.task1.main;

public class Lin2 {

	//Вычислить значение выражения по формуле 
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = 2.5;
		b = 3.1;
		c = 1.5;
		
		double temp;
		
		//Вычисление по действиям
		
		temp = Math.pow(b, 2);
		temp = temp + 4 * a * c;
		temp = Math.sqrt(temp);
		temp = (b + temp) / (2 * a);
		temp = temp - (Math.pow(a, 3)) * c;
		temp = temp + Math.pow(b, -2);
		
		double z;
		
		z = temp;
		
		System.out.println("z = " + z);
		
		//Вычисление одним действием
		
		z = (b + (Math.sqrt((Math.pow(b, 2)) + 4 * a * c))) / (2 * a) - ((Math.pow(a, 3)) * c) + Math.pow(b, -2);
		
		System.out.println("И снова z = " + z);

	}

}
