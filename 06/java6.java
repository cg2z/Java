package shin;
import java.util.Scanner;

class Reservation
{
	Scanner scanner = new Scanner(System.in);
	public Reservation(String seat[], String seatName)
	{
		System.out.print(seatName+">>");
		for(int i=0;i<10;i++)
		{
			System.out.print(seat[i]+" ");
		}
		System.out.println("");
		System.out.print("�̸�>>");
		String name = scanner.next();
		while(true)
		{
			System.out.print("��ȣ>>");
			int seatNum = scanner.nextInt();
			if(seatNum>=1&&seatNum<=10)
			{
				if(seat[seatNum-1]=="===")
				{
					seat[seatNum-1] = name;
					break;
				}
				else
					System.out.println("�̹� ����� �¼��Դϴ�. �ٽ� �Է��ϼ���.");
			}
			else 
				System.out.println("�߸��� �¼���ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
		}
	}
}

class Inquire
{
	public Inquire(String seat[])
	{
		for(int i=0;i<10;i++)
			System.out.print(seat[i]+" ");
		System.out.println("");
	}
}

class Cancel
{
	Scanner scanner = new Scanner(System.in);
	public Cancel(String seat[], String seatName)
	{
		System.out.print(seatName+">>");
		for(int i=0;i<10;i++)
			System.out.print(seat[i]+" ");
		System.out.println("");
		int count = 0;
		while(true)
		{
			System.out.print("�̸�>>");
			String name = scanner.next();
			for(int i=0;i<10;i++)
			{
				if(seat[i].equals(name))
				{
					seat[i] = "===";
					count++;
				}
			}
			if(count!=0)
				break;
			else if(count==0)
				System.out.println("�������� �ʴ� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
		}
	}
}

public class java6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String S[] = new String [10];
		String A[] = new String [10];
		String B[] = new String [10];
		
		for(int i=0;i<10;i++)
		{
			S[i] = "==="; A[i] = "==="; B[i] = "==="; 
		}
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while(true)
		{
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int n = scanner.nextInt();
			if(n==1)
			{
				while(true) 
				{
					System.out.print("�¼����� S(1), A(2), B(3)>>");
					int SAB = scanner.nextInt();
					if(SAB==1)
					{
						Reservation reservation = new Reservation(S, "S"); break;
					}
					else if(SAB==2)
					{
						Reservation reservation = new Reservation(A, "A"); break;
					}
					else if(SAB==3)
					{
						Reservation reservation = new Reservation(B, "B"); break;
					}
					else
						System.out.println("�������� �ʴ� �¼��Դϴ�. �ٽ� �Է��ϼ���.");
				}
			}
			
			else if(n==2)
			{
				Inquire inquireS = new Inquire(S);
				Inquire inquireA = new Inquire(A);
				Inquire inquireB = new Inquire(B);
				System.out.println("<<<���� �Ϸ��Ͽ����ϴ�.>>>");
			}
			
			else if(n==3)
			{
				while(true)
				{
					System.out.print("�¼� S:1, A:2, B:3>>");
					int SAB = scanner.nextInt();
					if(SAB==1)
					{
						Cancel cancel = new Cancel(S, "S"); break;
					}
					else if(SAB==2)
					{
						Cancel cancel = new Cancel(A, "A"); break;
					}
					else if(SAB==3)
					{
						Cancel cancel = new Cancel(B, "B"); break;
					}
					else
						System.out.println("�������� �ʴ� �¼���ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
				}
			}
			else if(n==4)
			{
				System.out.println("���α׷��� �����մϴ�."); break;
			}
			else
				System.out.println("�������� �ʴ� �޴��Դϴ�. �ٽ� �Է��ϼ���.");
		}
	}
}
