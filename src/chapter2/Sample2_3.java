package chapter2;

public class Sample2_3 {
	public static void main(String[] args) {
		for(int x = 5; x <= 10; x++) {
			System.out.println(x * 2);
		}
		
		System.out.println();
		
		int y = 1;  // 初期化はループ外でも可能
		for (; y <= 10; y++) {
			System.out.println(y);
		}
	}
}
