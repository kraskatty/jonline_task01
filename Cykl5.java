package by.jonline.task1.main;

public class Cykl5 {
	
	// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.

	public static void main(String[] args) {
		
		double a;
		double e;
		double n;
		double kolChlenov;
		double sum;
		
		kolChlenov = 20;
		e = 0.1;
		n = 1;
		sum = 0;
		
		while (n <= kolChlenov) {
			
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3,  n);
			
			if (Math.abs(a) >= e) {
				
				sum = sum + a;
			}
			
			n = n + 1;
		}
		
		System.out.println("Сумма равна " + sum);

	}

}
