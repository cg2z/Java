import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString(); // 추상 메소드
	abstract protected String getDestString(); // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		scanner.close();
	}
}

class Km2Mile extends Converter{
	public Km2Mile(double ratio) { this.ratio = ratio; }

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "Mile";
	}
}

public class Chap05_4 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1달러는 1200원
		toMile.run();
	}
}
