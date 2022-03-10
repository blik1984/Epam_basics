
/* Basic of software code development
 * �����, ������� 5
 * ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �.
 * ���� ������� ����������� ����� ����
*/

package by.epam.java.basic.cycle;

import java.util.*;

public class Cyc5 {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		double borderMin;
		double borderMax;
		double summ=0;
		@SuppressWarnings("unused")
		String trash;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		
		System.out.println("������� ������� �1 ����, �������� ������ ���� ����� ��� ������ ����");
		
		while (!S.hasNextDouble()) {
			System.out.println("������� ������� �1 ����, �������� ������ ���� ����� ��� ������ ����");
			trash = S.nextLine();
		}
		n1 = S.nextDouble();
		
		while (n1<0) {
			System.out.println("������� ������� �1 ����, �������� ������ ���� ����� ��� ������ ����");
			n1 = S.nextDouble();
		}
		
		System.out.println("������� ������� �2 ����, �������� ������ ���� ����� ��� ������ ����");
		
		while (!S.hasNextDouble()) {
			System.out.println("������� ������� �2 ����, �������� ������ ����� ��� ������ ����");
			trash = S.nextLine();
		}
		n2 = S.nextDouble();
		while (n2<0) {
			System.out.println("������� ������� �2 ����, �������� ������ ���� ����� ��� ������ ����");
			n2 = S.nextDouble();
		}
		System.out.println("������� ������ ���������, �������� ������ ���� ������ ����");
		// ���� ������ ���� ��� ������, �� ����������� ���� ��� �������� ����, �.�. ���������� �� ������
		
		while (!S.hasNextDouble()) {
			System.out.println("������� ������ ���������, �������� ������ ���� ������ ����");
			trash = S.nextLine();
		}
		
		double e = S.nextDouble();
		while (e<=0) {
			System.out.println("������� ������ ���������, �������� ������ ���� ����� ��� ������ ����");
			e = S.nextDouble();
		}
		
		borderMin = Math.min(n1, n2);
		borderMax = Math.max(n1, n2);
		
		while (borderMin <= borderMax) {
			
			double a;
			
			a = Math.abs((1 / Math.pow(2, borderMin)) + (1 / Math.pow(3, borderMin))); // ������� ������� � ���� ������
			
			if (a >= e) // ���� ������ �������� ������ ��� ����� �������, �� ���������
			{
				summ = summ + a;
			}
			borderMin++; // ��������� ��� ������ ������� �.�. �� ������ � ��������.
		}
		System.out.println("����� = " + summ);
	}
}