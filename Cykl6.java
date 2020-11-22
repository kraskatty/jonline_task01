package by.jonline.task1.main;

public class Cykl6 {
	
	// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

	public static void main(String[] args) {
		
		int chislo;
		int n;
		int length;
		
		char[] symbol = {'!', '@', '#', '%', '^', '&', '*', '(', ')', '_', '+', '=', '-'};
		
		length = symbol.length;
		n = 0;
		
		while (n <= (length-1)) {
		
			chislo = (int) symbol[n];
		
			System.out.println("Символ " + symbol[n] + " - число " + chislo);
			
			n = n + 1;
			
		}

	}

}
