package by.jonline.task1.main;

public class Cykl7 {
	
	// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

	public static void main(String[] args) {
		
		int m;
		int n;
		int chislo;
		int delitel;
		
		m = 10;
		n = 20;
				
		chislo = m;
		
		
		while (chislo <= n) {
			
			delitel = 2;
			
			System.out.print("Делители числа " + chislo + ": ");
			
			while (delitel < chislo) {
				
				if(chislo % delitel == 0) {
				
					System.out.print(delitel + "  ");
				
				}
				
				delitel = delitel + 1;
				
			}
			
			System.out.println("");
			
			chislo = chislo + 1;
			
		}

	}

}
