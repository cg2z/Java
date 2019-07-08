package shin;
import java.util.Scanner;
public class java3 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str[] = {"가위", "바위", "보"};
      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
      System.out.print("가위 바위 보! >> ");
      String random = scanner.next();
      while(!random.equals("그만"))
      {
          int n =(int)(Math.random()*3);
    	  if(random.equals("가위"))
    	  {
    		  if(str[n].equals("가위"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
    		  if(str[n].equals("바위"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
    		  if(str[n].equals("보"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
    	  }
    	  if(random.equals("바위"))
    	  {
    		  if(str[n].equals("가위"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
    		  if(str[n].equals("바위"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
    		  if(str[n].equals("보"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
    	  }
    	  if(random.equals("보"))
    	  {
    		  if(str[n].equals("가위"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
    		  if(str[n].equals("바위"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
    		  if(str[n].equals("보"))
    			  System.out.println("사용자 = "+random+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
    	  }
	      System.out.print("가위 바위 보! >> ");
		  random = scanner.next();
      }
      System.out.print("게임을 종료합니다...");
   }
}
