package by.jonline.task1.main;

public class Number34 {
	
	//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.

	public static void main(String[] args) {
		
		long a;
		
		a = 2654225648125L;
		
		long bite;
		long kBite;
		long mBite;
		long gBite;
		long tBite;
		
		System.out.print(a + " байт - это ");
		
		tBite = (int) (a / Math.pow(2, 40));
		
		a = a - tBite * (long) Math.pow(2, 40);
		
		gBite = (int) (a / Math.pow(2, 30));
		
		a = a - gBite * (long) Math.pow(2, 30);
		
		mBite = (int) (a / Math.pow(2, 20));
		
		a = a - mBite * (long) Math.pow(2, 20);
		
		kBite = (int) (a / Math.pow(2, 10));
		
		bite = a - kBite * (long) Math.pow(2, 10);
		
		if (tBite > 0) {
			System.out.print(tBite + " Тб ");
		}
		
		if (gBite > 0) {
			System.out.print(gBite + " Гб ");
		}
		
		if (mBite > 0) {
			System.out.print(mBite + " Мб ");
		}
		
		if (kBite > 0) {
			System.out.print(kBite + " Кб ");
		}
		
		if (bite > 0) {
			System.out.print(bite + " байт ");
		}

	}

}
