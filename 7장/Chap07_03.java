import java.util.Scanner;
import java.util.HashMap;

public class Chap07_03 {
	public static void find(HashMap<String, Integer> a) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if (nation.equals("�׸�"))
				break;
			if (a.containsKey(nation))
				System.out.println(nation + "�� �α��� " + a.get(nation));
			else
				System.out.println(nation + " ����� �����ϴ�.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea, 5000)");
		while (true) {
			System.out.print("���� �̸�, �α� >> ");
			String nation = scanner.next();
			if (nation.equals("�׸�"))
				break;
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		find(nations);
	}
}