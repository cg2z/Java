package shin;
import java.util.Scanner;

public class java2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int y3 = scanner.nextInt();

		double a1 = ((x1-y1)*(x1-y1))+((x2-y2)*(x2-y2));
		
		double a2 = x3+y3;        
		double a3 = Math.sqrt(a1);
		
		if(a3<=a2)
		{
			System.out.print("두 원은 서로 겹친다.");
		}
		else
		{
			System.out.print("두 원은 서로 겹치지 않는다.");
		}
	}
}