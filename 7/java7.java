package java7;
import java.util.Scanner;

class Point
{
	protected int x, y;
	
	public void setXY(int x, int y)
	{
		this.x = x; this.y = y;
	}
}

class ColorPoint extends Point
{
	private String color;
	public void setColor(String color)
	{
		this.color = color;
	}
	public ColorPoint(int x, int y)
	{
		this.x = x; this.y = y;
	}
	public ColorPoint()
	{
		color = "BLACK";
this.x = 0; this.y = 0;
	}
	public String toString()
	{
		System.out.print(color+"색의 ");
		return ("("+x+","+y+")의 점");
	}
}

public class java7 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
}
}
