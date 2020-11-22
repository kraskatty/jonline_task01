package by.jonline.task1.main;

public class Number13 {
	
	// Заданы координаты трех вершин треугольника (x1, y1), (x2, y2), (x3, y3). Найти его периметр и площадь.

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		x1 = 2;
		y1 = 2;
		x2 = 3.5;
		y2 = -4;
		x3 = -1;
		y3 = 2.5;
		
		double otr12;
		double otr23;
		double otr13;
		double p;
		double polP;
		double h12;
		double s;
		
		otr12 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		otr23 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		otr13 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		
		p = otr12  + otr23 + otr13;
		System.out.println("Периметр треугольника Р = " + p);
		
		polP = p / 2;
		
		h12 = 2 * Math.sqrt(polP * (polP - otr12) * (polP - otr23) * (polP - otr13)) / otr12; //Высота треугольника
		
		s = h12 * otr12 / 2; //Площадь
		System.out.println("Площадь треугольника S = " + s);
		
	}

}
