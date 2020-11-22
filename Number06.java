package by.jonline.task1.main;

public class Number06 {
	
	// В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л больше, чем в малом?

	public static void main(String[] args) {
		
		int n;
		int m;
		
		n = 7;
		m = 12;
		
		int litrB;
		
		litrB = ((80 / n) + 12) * m;
		
		System.out.println("В больших бидонах " + litrB + " литров молока.");

	}

}
