package shin;

import java.util.Scanner;
public class shin {

	public static void main(String[] args) {
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		while(true)
		{
			if(number<10||number>99)
			{
				System.out.println("10~99������ ���� �ƴմϴ�. �ٽ� �Է��ϼ���");
				number = scanner.nextInt();
			}
			
			else if(number%11==0)
			{
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
				break;
			}
			
			else if(number%11!=0)
			{
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�. �ٽ� �Է��ϼ���");
				number = scanner.nextInt();
			}
		}
	}
}
