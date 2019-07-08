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
		System.out.print("이름>>");
		String name = scanner.next();
		while(true)
		{
			System.out.print("번호>>");
			int seatNum = scanner.nextInt();
			if(seatNum>=1&&seatNum<=10)
			{
				if(seat[seatNum-1]=="===")
				{
					seat[seatNum-1] = name;
					break;
				}
				else
					System.out.println("이미 예약된 좌석입니다. 다시 입력하세요.");
			}
			else 
				System.out.println("잘못된 좌석번호입니다. 다시 입력하세요.");
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
			System.out.print("이름>>");
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
				System.out.println("존재하지 않는 이름입니다. 다시 입력하세요.");
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
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true)
		{
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int n = scanner.nextInt();
			if(n==1)
			{
				while(true) 
				{
					System.out.print("좌석구분 S(1), A(2), B(3)>>");
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
						System.out.println("존재하지 않는 좌석입니다. 다시 입력하세요.");
				}
			}
			
			else if(n==2)
			{
				Inquire inquireS = new Inquire(S);
				Inquire inquireA = new Inquire(A);
				Inquire inquireB = new Inquire(B);
				System.out.println("<<<조희를 완료하였습니다.>>>");
			}
			
			else if(n==3)
			{
				while(true)
				{
					System.out.print("좌석 S:1, A:2, B:3>>");
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
						System.out.println("존재하지 않는 좌석번호입니다. 다시 입력하세요.");
				}
			}
			else if(n==4)
			{
				System.out.println("프로그램을 종료합니다."); break;
			}
			else
				System.out.println("존재하지 않는 메뉴입니다. 다시 입력하세요.");
		}
	}
}
