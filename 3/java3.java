package shin;
import java.util.Scanner;
public class java3 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str[] = {"����", "����", "��"};
      System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
      System.out.print("���� ���� ��! >> ");
      String random = scanner.next();
      while(!random.equals("�׸�"))
      {
          int n =(int)(Math.random()*3);
    	  if(random.equals("����"))
    	  {
    		  if(str[n].equals("����"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
    		  if(str[n].equals("����"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
    		  if(str[n].equals("��"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
    	  }
    	  if(random.equals("����"))
    	  {
    		  if(str[n].equals("����"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
    		  if(str[n].equals("����"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
    		  if(str[n].equals("��"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
    	  }
    	  if(random.equals("��"))
    	  {
    		  if(str[n].equals("����"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
    		  if(str[n].equals("����"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
    		  if(str[n].equals("��"))
    			  System.out.println("����� = "+random+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
    	  }
	      System.out.print("���� ���� ��! >> ");
		  random = scanner.next();
      }
      System.out.print("������ �����մϴ�...");
   }
}
