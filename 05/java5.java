package shin;
import java.util.Scanner;

class Phone
{
	String name, number;
	public Phone(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
}
public class PhoneBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원수 >> ");
		int r = scanner.nextInt();
		Phone [] Phone = new Phone[r];
		
		for(int i = 0; i < Phone.length; i++)
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String name = scanner.next();
			String number = scanner.next();
			Phone[i] = new Phone(name, number);
		}
		System.out.println("저장되었습니다...");
		String search = "";
		String save = "";
		
		while(!search.equals("그만"))
		{
			System.out.print("검색할 이름 >> ");
			search = scanner.next();
			for(int i = 0; i < r; i++)
			{
				if(search.equals(Phone[i].name))
				{
					System.out.println(search+"의 번호는 "+Phone[i].number+" 입니다.");
					save = search;
				}
			}
			if(save.equals("")&&!search.equals("그만"))
			{
				System.out.println(search+" 이 없습니다.");
			}
			save = "";
		}
		System.out.print("프로그램을 종료합니다.");
	}
}
