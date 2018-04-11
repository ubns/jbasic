package chapter2;

// クラスブロック START
public class Sample2_10 { 
	int x;  // インスタンス変数（フィールド）
	static int a;  // static変数
	
	// メソッドブロック START
	void add() {  
		int y;  // ローカル変数
		//System.out.println(x + y);
	} 
	// メソッドブロック END
	
	 // メソッドブロック STRAT
	void scopeSample() {
		//System.out.println(y);
		for (int i = 0; i < x; i++) {
			System.out.println(i);
		}
	}  
	// メソッドブロック END
	
}  
//クラスブロック END