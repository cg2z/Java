import java.util.Scanner;

abstract class Calculate{
	protected int a, b;
	public void setValue(int a, int b) { this.a = a; this.b = b; }
	abstract int calculate();
}

class Add extends Calculate{
	public Add(int a, int b) { setValue(a, b); }
	@Override
	int calculate() {
		return a+b;
	}
}

public class Chap05_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char c = scanner.next().charAt(0);
		
		Calculate cal;
		
		if(c=='+')
		{
			cal = new Add(num1, num2);
			System.out.print(cal.calculate());
		}
	}
	
}