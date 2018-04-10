package chapter2;

public class Sample1_6 {
	public static void main(String[] args) {
		
		
		int x = 10;
		int y = 20;
		
		if (x < y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		
		boolean b;
		int i  = 5;
		
		b = 10 > i & 2 > i;
		System.out.println(b);
		
		if (10 > i | 2 > i) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		// & = 右の値　かつ　左の値
		// | = 右の値　もしくは　左の値
	}
}
