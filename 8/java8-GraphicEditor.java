package shin;
import java.util.Scanner;

public class GraphicEditor{   
	   public static void main(String[] args) {
		   Shape start = null, last = null, LRC = null;
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		   
		   while (true)
		   {
			   System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			   int num = scanner.nextInt();
			   if (num==1)
			   {
				   System.out.print("Line(1), Rect(2), Circle(3) >> ");
				   int insert = scanner.nextInt();
				   
				   if(insert == 1) 
					   LRC = new Line();
				   else if(insert == 2) 
					   LRC = new Rect();
				   else if(insert == 3) 
					   LRC = new Circle();
				
				   if(start == null) 
				   { 
					   start = LRC;
					   last = LRC;
				   }
				   else 
				   {
					   last.setNext(LRC);
					   last = LRC;
				   }
			   }
			
			   else if(num ==2)
			   {
				   Shape now = start;
				   Shape back = start;
				   int count = 0;
				   
				   System.out.print("������ ������ ��ġ >> ");
				   int pos = scanner.nextInt();
				   
				   if (pos == 1)
					   start = start.getNext();
				   else
				   {
					   for(int i = 1; i < pos; i++) 
					   {
						   now = back; 
						   back = back.getNext();
						   if (back == null)
						   {
							   System.out.println("������ �� �����ϴ�.");
							   count++;
						   }
					   }
					   if(count==0)
					   {
						   if (back == last) {
								last = now; 
								last.setNext(null);
						   }
						   else
							   now.setNext(back.getNext());
					   }
				   }
			   }
			
			   else if(num==3)
			   {
				   Shape out = start;
				   if (out==null)
					   System.out.println("������ �����ϴ�.");
				   else
				   {
					   while(out != null) 
					   {
						   out.draw();
						   out = out.getNext();
					   }
				   }
			   }
			   
			   else if(num==4)
			   {
				   System.out.print("beauty�� �����մϴ�");
				   break;
			   }
		   }
	   }
}
