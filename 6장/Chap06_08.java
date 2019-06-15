import java.util.Scanner;

public class Chap06_08{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		

		for(int i=0;i<str.length();i++)
		{
			str += str.charAt(0);
			str = str.substring(1);
			
			System.out.println(str);
		}
	}
}