import java.util.Calendar;

public class Chap06_05{
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.println("현재시간은 "+hour+"시 "+minute+"분 입니다.");
		if(hour>=4&&hour<12)
			System.out.println("Good Morning");
		else if(hour<18)
			System.out.println("Good afternoon");
		else if(hour<22)
			System.out.println("Good Evening");
		else 
			System.out.println("Good Night");
	}
}