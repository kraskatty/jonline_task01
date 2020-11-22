package by.jonline.task1.main;

public class Number32 {
	
	// Текущее показание электронных часов: m ч (0 <= m <=23) n мин (0 <= n <= 59) k с (0 <= k <= 59). Какое время будут показывать часы через p ч q мин r c?

	public static void main(String[] args) {
		
		int m; //часы
		int n; // минуты
		int k; // секунды
		
		m = 15;
		n = 54;
		k = 28;
		
		int p; //часы
		int q; //минуты
		int r; //секунды
		
		p = 13;
		q = 15;
		r = 45;
		
		k = k + r;
		n = n + q + k / 60;
		m = m + p + n / 60;
		
		k = k % 60;
		n = n % 60;
		m = m % 24;
		
		System.out.println("Новое время на часах: " + m + " ч " + n + " мин " + k + " с.");
		

	}

}
