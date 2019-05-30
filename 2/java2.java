package shin;
import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		while(c<'a'||c>'z')
		{
			System.out.print("a-z 사이의 문자가 아닙니다 다시 입력하세요 >> ");
			s = scanner.next();
			c = s.charAt(0);
		}
		
		for(c=c;c>='a';c--)
		{
			for(char i='a';i<=c;i++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}