package by.jonline.task1.main;

public class Lin5 {
	
	//���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. �������
	//������ �������� ������������ � �����, ������� � �������� � ��������� �����:
	//��� ����� SSc.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int t;
		
		t = 1256008;
		
		int h;
		
		h = t / 3600; //����
		
		int temp;
		
		temp = t - h * 3600; //������� ������
		
		int m;
		
		m = temp / 60; //������
		
		temp = temp - m * 60; //������� ������
		
		int s;
		
		s = temp; //�������
		
		System.out.println(t + "� ��� " + h + "� " + m + "��� " + s + "�");
		
	}

}
