package shin;
import java.util.Scanner;
public class java4 {

	public static void main(String[] args) {
		int sum = 0;
		
	
		for (int i=0; i<args.length; i++) 
		{
			try 
			{
				sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				args[i] = "0";
			}
		}
		System.out.println(sum);
	}

}