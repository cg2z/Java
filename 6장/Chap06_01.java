class Mypoint{
	private int x, y;
	public Mypoint(int x, int y) { this.x=x; this.y=y;}
	public boolean equals(Mypoint q) {
		if (this.x==q.x&&this.y==q.y)
			return true;
		else return false;
	}
	public String toString() {
		return ("Point("+x+","+y+")");
	}
}

public class Chap06_1{
	public static void main(String[] args)
	{
		Mypoint p = new Mypoint(3, 50);
		Mypoint q = new Mypoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
	}
}