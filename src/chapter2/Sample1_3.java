package chapter2;
/*
 * 変数
 */
public class Sample1_3 {
	public static void main(String[] args) {
		int a;  // 変数の宣言
		a = 100;  // 値の代入
		int b = 300;  // 変数の初期化
		
		System.out.println(a);  // 変数の利用
		System.out.println(b);  // 変数の利用
		
		a = 200;  // 値の代入
		System.out.println(a);  // 変数の利用
		
		// 以下のような異なる型の代入は不可
		//a = 3.14;
		//a = 'abc';
		System.out.println(a);  // 変数の利用
	}
}
