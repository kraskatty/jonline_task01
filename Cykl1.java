package by.jonline.task1.main;

public class Cykl1 {
	
	// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

	public static void main(String[] args) {
		
		int chislo;
		int x;
		int rez;
		
		chislo = 16;
		x = 1;
		rez = 0;
		
		if (chislo <= 0) {
			
			System.out.println("Введите целое положительное число");
		} else {
		
			while (x <= chislo) {
			
				rez = rez + x;	
				x = x + 1;
				
			}
			
			System.out.println("Сумма чисел от 1 до " + chislo + " равна " + rez);
		}
		
	}
}
