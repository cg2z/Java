import java.util.Scanner;
import java.util.ArrayList;

public class Chap07_02{
	public static void big(ArrayList<Character> b)
	{
		double sum = 0;
		for(int i=0;i<b.size();i++)
		{
			if(b.get(i)=='A')
				sum+= 4;
			else if(b.get(i)=='B')
				sum+= 3;
			else if(b.get(i)=='C')
				sum+= 2;
			else if(b.get(i)=='D')
				sum+= 1;
			else if(b.get(i)=='F')
				sum+= 0;
		}
		System.out.println(sum/b.size());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> a = new ArrayList<Character>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력 (A/B/C/D/F) >> ");
		for(int i=0;i<6;i++)
		{
			char grade = scanner.next().charAt(0);
			a.add(grade);
		}
		big(a);
	}
}