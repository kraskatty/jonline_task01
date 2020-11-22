package by.jonline.task1.main;

public class Cykl8 {
	
	// Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.

	public static void main(String[] args) {
		
		int a;
		int b;
		int n10a;
		int n10b;
		int cyfraA;
		int cyfraB;
		int bAgain;
		int n10bAgain;
		int i;
		
		a = 12;
		b = 3456;
		
		n10a = 1;
		n10b = 1;
		i = 0;
		bAgain = b;
		
		// Находим количество разрядов в числе a
		
		while (a / n10a > 0) {
			n10a = n10a * 10;
		}
		
		n10a = n10a / 10;
		
		// Находим количество разрядов в числе b
		
		while (b / n10b > 0) {
			n10b = n10b * 10;
		}
		
		n10b = n10b / 10;
		n10bAgain = n10b; 
		
		// Определяем цифры числа a
		
		while (a != 0) {
			
			cyfraA = a / n10a;
			
			b = bAgain; // Восстанавливаем значения для нового запуска цикла
			n10b = n10bAgain; // Восстанавливаем значения для нового запуска цикла
			
			// Перебираем цифры числа b и сравниваем с цифрами числа a
			
			while (b != 0) {
				
				cyfraB = b / n10b;
				
				if (cyfraA == cyfraB) {
					System.out.println("Цифра " + cyfraA + " общая для двух чисел");
					i = i + 1; // Количество общих цифр
				}
				
				b = b - cyfraB * n10b;
				n10b = n10b / 10;
			}
			
			a = a - cyfraA * n10a;
			n10a = n10a / 10;
		}
		
		if (i == 0) {
			System.out.println("Общих цифр для двух чисел не обнаружено.");
		}
	}
}
