import java.util.Scanner;
import java.util.Vector;

public class java12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> vector = new Vector<Shape>();
		System.out.println("그래픽 에디터 beauty를 실행합니다.");

		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int num = scanner.nextInt();

			if (num == 1) {
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int LRC = scanner.nextInt();
				if (LRC == 1)
					vector.add(new Line());
				else if (LRC == 2)
					vector.add(new Rect());
				else if (LRC == 3)
					vector.add(new Circle());
			} else if (num == 2) {
				System.out.print("삭제할 도형의 위치 >> ");
				int del = scanner.nextInt();
				if (del > vector.size()||del<=0)
					System.out.println("삭제할 수 없습니다.");
				else
					vector.remove(del - 1);
			} else if (num == 3) {
				for (int i = 0; i < vector.size(); i++)
					vector.elementAt(i).draw();
			} else if (num == 4) {
				System.out.print("beauty를 종료합니다.");
				break;
			}
		}
	}
}
