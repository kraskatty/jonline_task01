package by.jonline.task1.main;

public class Lin5 {
	
	//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
	//Вывести данное значение длительности в часах, минутах и секундах в следующей форме 
	//ННч ММмин SSc.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int t;
		
		t = 1256008;
		
		int h;
		
		h = t / 3600; //часов
		
		int temp;
		
		temp = t - h * 3600; //остаток секунд
		
		int m;
		
		m = temp / 60; //минут
		
		temp = temp - m * 60; //остаток секунд
		
		int s;
		
		s = temp; //секунд
		
		System.out.println(t + " секунд это  " + h + "ч " + m + "мин " + s + "с");
		
	}

}
