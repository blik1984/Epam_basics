/* Basic of software code development
 * �����, ������� 7
 * ��� ������� ������������ ����� � �������� ������������� ��������� ������� ��� �������� ����� ������� � ������ ����� 
*/

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc7 {
	
	public static void main(String[] args) {
		
		int m;
		int n;
		int minBord;
		int maxBord;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������ ��������� � ���� ������ �������������� �����");
		m = S.nextInt();
		System.out.println("������� ����� ��������� � ���� ������ �������������� �����");
		n = S.nextInt();
		
		minBord = Math.min(m, n);
		maxBord = Math.max(m, n);
		
		while (minBord <= maxBord) {
			
			for (int i = 2; i < minBord; i++) { // �������� ���������� � 2 (��������� �������) � ������������� �� ��������
											// ������ ����� (��������� ���� �����)
				if ((minBord % i) == 0) { // ��������� ��� �������� ������ ���� ����� (�������� �� ������).
					System.out.println("����� " + minBord + " ������� �� " + i);
				}
			}
			minBord++;
		}
	}
}
