package shin;
import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		while(c<'a'||c>'z')
		{
			System.out.print("a-z ������ ���ڰ� �ƴմϴ� �ٽ� �Է��ϼ��� >> ");
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