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
		
		System.out.print("�ο��� >> ");
		int r = scanner.nextInt();
		Phone [] Phone = new Phone[r];
		
		for(int i = 0; i < Phone.length; i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�) >> ");
			String name = scanner.next();
			String number = scanner.next();
			Phone[i] = new Phone(name, number);
		}
		System.out.println("����Ǿ����ϴ�...");
		String search = "";
		String save = "";
		
		while(!search.equals("�׸�"))
		{
			System.out.print("�˻��� �̸� >> ");
			search = scanner.next();
			for(int i = 0; i < r; i++)
			{
				if(search.equals(Phone[i].name))
				{
					System.out.println(search+"�� ��ȣ�� "+Phone[i].number+" �Դϴ�.");
					save = search;
				}
			}
			if(save.equals("")&&!search.equals("�׸�"))
			{
				System.out.println(search+" �� �����ϴ�.");
			}
			save = "";
		}
		System.out.print("���α׷��� �����մϴ�.");
	}
}
