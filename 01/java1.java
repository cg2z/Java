package shin;

import java.util.Scanner;
public class shin {

	public static void main(String[] args) {
		System.out.println("2자리수 정수 입력(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		while(true)
		{
			if(number<10||number>99)
			{
				System.out.println("10~99사이의 수가 아닙니다. 다시 입력하세요");
				number = scanner.nextInt();
			}
			
			else if(number%11==0)
			{
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
				break;
			}
			
			else if(number%11!=0)
			{
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다. 다시 입력하세요");
				number = scanner.nextInt();
			}
		}
	}
}
