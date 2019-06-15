class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class IPTV extends TV{
	private String address;
	private int color;
	public IPTV(String address, int size, int color) { super(size); this.address = address; this.color = color; }
	void printProperty() { System.out.println("���� IPTV�� " + address + " �ּ��� " + getSize() + "��ġ " + color + "�÷�"); }
}

public class Chap05_2 {
	public static void main(String[]args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
