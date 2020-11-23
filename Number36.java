package by.jonline.task1.main;

public class Number36 {
	
	//Найти частное произведений четных и нечетных цифр четырехзначного числа.

	public static void main(String[] args) {
		
		int chislo;
		
		chislo = 2671;
		
		int prChet;
		int prNechet;
		int n10;
		int cyfra;
		double rez;
		
		n10 = 1000;
		prChet = 1;
		prNechet = 1;
		
		while (n10 >= 1) {
			
			cyfra = chislo / n10;
			chislo = chislo - cyfra * n10;
			
			if (cyfra % 2 == 0) {
				prChet = prChet * cyfra;
			} else {
				prNechet = prNechet * cyfra;
			}
			
			n10 = n10 / 10;
		}
		
		System.out.println("Произведение нечетных чисел равно " + prNechet);
		System.out.println("Произведение четных число равно " + prChet);
	
		rez = (double) prChet / (double) prNechet;
		
		System.out.println("Частное равно " + rez);
	
	}

}
