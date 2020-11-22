package by.jonline.task1.main;

public class Number35 {
	
	//Даны натуральные числа M и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

	public static void main(String[] args) {
		
		int m;
		int n;
		
		m = 1368;
		n = 23;
		
		int chislo;
		int cel;
		int drobChislit;
		int drobZnamenat;
		int n10;
		int cyfraMin;
		int cyfraCel;
		int cyfraDrob;
		int cyfraMax;
		
		n10 = 1;
		cel = m / n;
				
		drobChislit = m - cel * n;
		drobZnamenat = n;
		
		//Ищем младшую цифру целой части
		
		while ((cel / n10) > 0) {
			n10 = n10 * 10;
		}
		
		n10 = n10 / 10;
		
		if (cel > 0) {
			cyfraMin = cel / n10;
				
			while (n10 >=1) {
				cyfraCel = cel / n10;
				cel = cel - cyfraCel * n10;
				if (cyfraCel <= cyfraMin) {
					cyfraMin = cyfraCel;
				}
				n10 = n10 / 10;
			}
			System.out.println("Младшая цифра целой части числа - " + cyfraMin);
		} else {
			System.out.println("Целой части в числе нет.");
		}
		
		//Ищем старшую цифру дробной части
		
		cyfraMax = 0;
		n10 = 1;
		
		//числитель
		
		while ((drobChislit / n10) > 0) {
			n10 = n10 * 10;
		}
		
		n10 = n10 / 10;
		
		if (drobChislit == 0) {
			System.out.println("Дробной части числа нет.");
		}
				
		if (drobChislit >= 1) {
			cyfraMax = drobChislit / n10;
			while (n10 >=1) {
				cyfraDrob = drobChislit / n10;
				drobChislit = drobChislit - cyfraDrob * n10;
				if (cyfraDrob >= cyfraMax) {
					cyfraMax = cyfraDrob;
				}
				n10 = n10 / 10;
			}
		}	
		
		//знаменатель
		
		n10 = 1;
		
		while ((drobZnamenat / n10) > 0) {
			n10 = n10 * 10;
		}
		
		while (n10 >= 1) {
			cyfraDrob = drobZnamenat / n10;
			drobZnamenat = drobZnamenat - cyfraDrob * n10;
			if (cyfraDrob >= cyfraMax) {
				cyfraMax = cyfraDrob;
			}
			
			n10 = n10 / 10;
		}
		
		System.out.println("Старшая цифра дробной части - " + cyfraMax);
		
	}

}
