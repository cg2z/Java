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
		return (Circle( + this.x + , + this.y + ) 반지름   + this.radius);
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
		System.out.println(원 a   + a);
		System.out.println(원 b   + b);
		if (a.equals(b))
			System.out.println(같은 원);
		else
			System.out.println(서로 다른 원);
	}
}
