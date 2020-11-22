package by.jonline.task1.main;

public class Number34 {
	
	//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.

	public static void main(String[] args) {
		
		double a;
		
		a = 452645881;
		
		double bite;
		int kBite;
		int mBite;
		int gBite;
		int tBite;
		
		System.out.print(a + " байт - это ");
		
		tBite = (int) (a / Math.pow(2, 40));
		
		a = a - tBite * Math.pow(2, 40);
		
		gBite = (int) (a / Math.pow(2, 30));
		
		a = a - gBite * Math.pow(2, 30);
		
		mBite = (int) (a / Math.pow(2, 20));
		
		a = a - mBite * Math.pow(2, 20);
		
		kBite = (int) (a / Math.pow(2, 10));
		
		bite = a - kBite * Math.pow(2, 10);
		
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
