import java.util.Scanner;
import java.util.Vector;

public class Chap07_04 {
	public static void print(Vector<Integer> a) {
		for (int i = 0; i < a.size(); i++)
			System.out.print(a.get(i) + " ");
		System.out.println();
	}

	public static void avg(Vector<Integer> b) {
		int sum = 0;
		for (int i = 0; i < b.size(); i++)
			sum += b.get(i);
		System.out.println("현재 평균 " + sum / b.size());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();

		while (true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int num = scanner.nextInt();
			if (num == 0)
				break;
			else {
				v.add(num);
				print(v);
				avg(v);
			}
		}
	}
}