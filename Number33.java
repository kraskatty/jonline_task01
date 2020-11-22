package by.jonline.task1.main;

public class Number33 {
	
	// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

	public static void main(String[] args) {
		
		char symb;
		char symbBefore;
		char symbAfter;
		int symbN;
		
		symb = '$';
		
		symbN = (int) symb;
		
		System.out.println("Порядковый номер символа " + symb + " - " + symbN);
		
		symbBefore = (char) (symbN - 1);
		
		System.out.println("Предыдущий символ - " + symbBefore);
		
		symbAfter = (char) (symbN + 1);
		
		System.out.println("Следующий символ - " + symbAfter);
		

	}

}
