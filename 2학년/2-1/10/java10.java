package java10;
import java.util.Scanner;

class Circle {
	public int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return (Circle( + this.x + , + this.y + ) ������   + this.radius);
	}

	public boolean equals(Object obj) {
		Circle p = (Circle) obj;
		if (p.x == x && p.y == y)
			return true;
		else
			return false;
	}
}

public class java10 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println(�� a   + a);
		System.out.println(�� b   + b);
		if (a.equals(b))
			System.out.println(���� ��);
		else
			System.out.println(���� �ٸ� ��);
	}
}
