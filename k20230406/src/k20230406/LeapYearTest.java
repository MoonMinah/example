package k20230406;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, ����� �Ǵ��� �⵵�� �Է��ϼ���: ");
		int year = scanner.nextInt();
		
//		����, ��� �Ǻ���
//		�⵵�� 4�� ���� �������� 100���� ���� �������� �ʰų� 400���� ���� �������� ����,
//		�׷��� ������ ���
		
//		���α׷����� ������ ���Ǵ� ���� ������ �����ؼ� ����ϸ� ���ϴ�.
//		������ ����ϴ� ������ ���� Ÿ���� ������ �޼ҵ��� �̸��� "is"�� �����ϴ°� �����̴�.
		boolean isLeapYear = year%4==0 && year%100 !=0 || year%400==0;
		
//		2023�� ���, 2024�� ����, 2000�� ����, 2100�� ���
		if(year%4==0 && year%100 !=0 || year%400==0) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		
//		���� ������(?:)
//		���� �����ڴ� ���ǽ��� ���� �� ���̳� ������ �� ������ ������ ���� 1������ �� ����ϸ� ���ϴ�.
//		���ǽ� ? �� ������ ���� : ���� ������ ����
		
		System.out.println(isLeapYear ? "��" : "��");
//		���� ������ ��ȣ�� ������Ѵ�.
		System.out.println(year + "����" + (isLeapYear ? "��" : "��" + "���Դϴ�."));
		System.out.printf("%d���� %s���Դϴ�.\n", year, isLeapYear ? "��" : "��");
		System.out.printf("%d���� %c���Դϴ�.\n", year, isLeapYear ? '��' : '��');
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	}

}
