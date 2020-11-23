package by.jonline.task1.main;

public class Number37 {
	
	//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false - в противном случае.

	public static void main(String[] args) {
		
		int chisloN;
		boolean uslovie;
		int n10;
		
		//1. Целое число N является четным двузначным числом.
		
		chisloN = 86;
		
		int i;
		
		n10 = 1;
		i = 0;
		
		while (chisloN / n10 > 0) {
			i = i + 1;
			n10 = n10 * 10;
		}
		
		uslovie = (chisloN % 2 == 0) && (i == 2);
		
		System.out.println("1. Целое число N является четным двузначным числом - " + uslovie);
		
		
		//2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
		
		chisloN = 1634;
		
		int sum12;
		int sum34;
		int cyfra;
		
		sum12 = 0;
		sum34 = 0;
		n10 = 1000;
		
		while (n10 > 10) {
			
			cyfra = chisloN / n10;
			sum12 = sum12 + cyfra;
			chisloN = chisloN - cyfra * n10;
			n10 = n10 / 10;
		}
		
		while (n10 > 0) {
			
			cyfra = chisloN / n10;
			sum34 = sum34 + cyfra;
			chisloN = chisloN - cyfra * n10;
			n10 = n10 / 10;
		}
		
		uslovie = sum12 == sum34;
		
		System.out.println("2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр - " + uslovie);
		
		
		//3. Сумма цифр данного трехзначного числа N является четным числом.
		
		chisloN = 291;
		
		int sum;
		
		sum = 0;
		n10 = 100;
		
		while (n10 > 0) {
			
			cyfra = chisloN / n10;
			sum = sum + cyfra;
			chisloN = chisloN - cyfra * n10;
			n10 = n10 / 10;
		}
		
		uslovie = sum % 2 == 0;
		
		System.out.println("3. Сумма цифр данного трехзначного числа N является четным числом - " + uslovie);
		
		
		//4. Точка с координатами (x, y) принадлежит части плоскости, лежащей между прямыми x = m, x = n (m < n).
		
		double x;
		double y;
		double m;
		double n;
		
		x = 5.7;
		y = -2.4;
		
		m = -3.2;
		n = 7.1;
		
		uslovie = (x > m) && (x < n);
		
		System.out.println("4. Точка с координатами (x, y) принадлежит части плоскости, лежащей между прямыми x = m, x = n (m < n) - " + uslovie);
		
		//5. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		
		chisloN = 193;
		
		double kvadr;
		double kub;
		
		n10 = 100;
		sum = 0;
		
		kvadr = Math.pow(chisloN, 2);
		
		while (n10 > 0) {
			
			cyfra = chisloN / n10;
			chisloN = chisloN - cyfra * n10;
			n10 = n10 / 10;
			sum = sum + cyfra;
		}
		
		kub = Math.pow(sum, 3);
		
		uslovie = kvadr == kub;
		
		System.out.println("5. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа - " + uslovie);
		
		
		//6. Треугольник со сторонами a, b, c является равнобедренным.
		
		double a;
		double b;
		double c;
		
		a = 3.5;
		b = 7.1;
		c = 2.4;
		
		uslovie = (a == b) || (b == c) || (c == a);
		
		System.out.println("6. Треугольник со сторонами a, b, c является равнобедренным - " + uslovie);
		
		
		//7. Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		
		chisloN = 167;
		
		int cyfra1;
		int cyfra2;
		int cyfra3;
		
		cyfra1 = chisloN / 100;
		chisloN = chisloN - cyfra1 * 100;
		cyfra2 = chisloN / 10;
		cyfra3 = chisloN - cyfra2 * 10;

		uslovie = (cyfra1 + cyfra2 == cyfra3) || (cyfra2 + cyfra3 == cyfra1) || (cyfra1 + cyfra3 == cyfra2);
		
		System.out.println("7. Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре - " + uslovie);
		
		//8. Заданное число N является степенью числа a (показатель степени может находиться в диапазоне от 0 до 4).
		
		chisloN = 27;
		a = 4;
		
		boolean uslovie8;
		i = 0;
		
		uslovie8 = Math.pow(a, i) == chisloN;
		
		while (i <= 4) {
			if (Math.pow(a, i) == chisloN) {
				uslovie8 = Math.pow(a, i) == chisloN;
			}
			i = i + 1;
		}
		
		System.out.println("8. Заданное число N является степенью числа a (показатель степени может находиться в диапазоне от 0 до 4) - " + uslovie8);
		
		
		//9. График функции y = ax2 + bx + c проходит через заданную точку с координатами (m, n).
		
		a = 1.5;
		b = 3.2;
		c = 2.5;
		
		m = 1;
		n = 0.8;
		
		uslovie = (n == (a * m * m + b * m + c));
		
		System.out.println("9. График функции y = ax2 + bx + c проходит через заданную точку с координатами (m, n) - " + uslovie);
				
	}

}
