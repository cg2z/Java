package shin;
import java.util.Scanner;

public class java2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int y3 = scanner.nextInt();

		double a1 = ((x1-y1)*(x1-y1))+((x2-y2)*(x2-y2));
		
		double a2 = x3+y3;        
		double a3 = Math.sqrt(a1);
		
		if(a3<=a2)
		{
			System.out.print("�� ���� ���� ��ģ��.");
		}
		else
		{
			System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		}
	}
}