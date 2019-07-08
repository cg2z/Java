import java.util.Scanner;

public class java11 {
	public static void main(String[] args) {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			if (line.equals(";"))
				break;
			line = line.toUpperCase();
			sb.append(line);
		}
		String count[] = new String[26];
		for (int i = 0; i < 26; i++)
			count[i] = "";
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
				count[sb.charAt(i) - 65] += "-";
		}
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (65 + i));
			System.out.println(count[i]);
		}
	}
}