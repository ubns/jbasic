package chapter2;

class StaticCodeExample {
	static int counter = 0;  // static変数
	static {  // staticイニシャライザ
		counter++;
		System.out.println("Static Code block: counter:" + counter);
	}
	StaticCodeExample() { // コンストラクタ
		System.out.println("Constractor:counter :" + counter);
	}
}
public class Sample3_5 {
	public static void main(String[] args) {
		StaticCodeExample sec1 = new StaticCodeExample();
		StaticCodeExample sec2 = new StaticCodeExample();
	}
}
