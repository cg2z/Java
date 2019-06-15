class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) { super(size); this.color = color; }
	void printProperty() {System.out.print( getSize() + "��ġ " + color + "�÷�"); }
}

public class chap05_1 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
