class Circle{
	private int x, y, radius;
	public Circle(int x, int y, int r) {this.x=x; this.y=y; radius=r;}
	public String toString() {
		return ("Circle(" + x + "," + y + ")������" + radius);
	}

	public boolean equals(Circle b) {
		if (this.x == b.x && this.y == b.y)
			return true;
		else
			return false;
	}
}
public class Chap06_02{
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);

		System.out.println("�� a : " +a);
		System.out.println("�� b : " +b);
		
		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}