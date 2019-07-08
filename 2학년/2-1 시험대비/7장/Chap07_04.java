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
		System.out.println("���� ��� " + sum / b.size());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();

		while (true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
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