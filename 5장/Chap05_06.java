class Point1 {
	private int x, y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint1 extends Point1 {
	private String color;

	public ColorPoint1(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColorPoint1(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	public ColorPoint1() {
		super(0, 0);
		this.color = "BLACK";
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return (color + "색의 (" + getX() + "," + getY() + ")의 점");
	}
}

public class Chap05_6 {
	public static void main(String[] args) {
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint1 cp = new ColorPoint1(5, 5);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
