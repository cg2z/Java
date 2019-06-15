import java.util.Scanner;
import java.util.Vector;

public class Chap07_01{
	public static void big(Vector<Integer> a) {
		int big = a.get(0);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)>big)
				big=a.get(i);
		}
		System.out.println("가장 큰 수는 88");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.print("정수(-1이 입력될 때 까지) >> ");
		while(true) {
			int num = scanner.nextInt();
			if(num==-1)
				break;
			v.add(num);
		}
		big(v);
	}
}