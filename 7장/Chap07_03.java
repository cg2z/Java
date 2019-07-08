import java.util.Scanner;
import java.util.HashMap;

public class Chap07_03 {
	public static void find(HashMap<String, Integer> a) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if (nation.equals("그만"))
				break;
			if (a.containsKey(nation))
				System.out.println(nation + "의 인구는 " + a.get(nation));
			else
				System.out.println(nation + " 나라는 없습니다.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea, 5000)");
		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = scanner.next();
			if (nation.equals("그만"))
				break;
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		find(nations);
	}
}