package shin;
import java.util.Scanner;

interface Shape
{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw()
	{
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape
{
	private int radius;
	Circle(int r)
	{
		radius = r;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}

	@Override
	public double getArea() {
		double area;
		area = PI*radius*radius;
		return area;
	}
}

class Oval implements Shape
{
	private int hor, ver;
	Oval(int x, int y)
	{
		hor = x; ver = y;
	}
	
	@Override
	public void draw() {
		System.out.println(hor+"x"+ver+"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		double area;
		area = PI*hor*ver;
		return area;
	}
}

class Rect implements Shape
{
	private int hor, ver;
	Rect(int x, int y)
	{
		hor = x; ver = y;
	}
	
	@Override
	public void draw() {
		System.out.println(hor+"x"+ver+"크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		double area;
		area = hor*ver;
		return area;
	}
}


public class java9 {
	public static void main(String [] args)
	{
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());
	}
}
