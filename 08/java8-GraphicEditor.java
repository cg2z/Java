package shin;
import java.util.Scanner;

public class GraphicEditor{   
	   public static void main(String[] args) {
		   Shape start = null, last = null, LRC = null;
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("그래픽 에디터 beauty를 실행합니다.");
		   
		   while (true)
		   {
			   System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
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
				   
				   System.out.print("삭제할 도형의 위치 >> ");
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
							   System.out.println("삭제할 수 없습니다.");
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
					   System.out.println("도형이 없습니다.");
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
				   System.out.print("beauty를 종료합니다");
				   break;
			   }
		   }
	   }
}
