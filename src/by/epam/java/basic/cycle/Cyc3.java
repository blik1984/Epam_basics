
/* Basic of software code development
 * �����, ������� 3
 * ����� ����� ��������� ������ ��� �����
*/

package by.epam.java.basic.cycle;

public class Cyc3 {
	
	public static void main(String[] args) {
		
		int x = 0; // �����, �� �� �������
		int y = 0; // ������� �����
		int z = 0; // �����
		
		while (x <= 100) { // �������� �� ���� �� ��� ������������
			y = x * x;
			z = z + y;
			x++;
		}
		System.out.println("����� ��������� ������ ��� ����� = " + z);
	}
}
