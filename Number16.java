package by.jonline.task1.main;

public class Number16 {
	
	//Найти произведение цифр заданного четырехзначного числа.

	public static void main(String[] args) {
		
		int chislo;
		int n10; 
		
		chislo = 1239;
		n10 = 3;
		
		int cyfra;
		int rez;
		
		rez = 1;
		
		while (n10 >= 0) {
			
			cyfra = chislo / (int)(Math.pow(10, n10));
			rez = rez * cyfra;
			chislo = chislo - cyfra * (int) (Math.pow(10, n10));
			
			n10 = n10 - 1;
		}
		
		System.out.println("Произведение цифр числа равно " + rez);

	}

}
