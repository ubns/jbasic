package chapter2;

public class Sample1_5 {
	public enum Seas { SPRING,SUMMER,AUTUMN,WINTER }
	
	public static void main(String[] args) {
		System.out.println("===特定要素の取り出し===");
		Seas s1 = Seas.WINTER;
		System.out.println(s1);
		
		System.out.println("===全要素の取り出し===");
		Seas[] s = Seas.values();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		// 上記3行は以下のコードと置き換えることができます。（拡張for文）
		//for (Seas s : Seas.values()) {
		//	System.out.println(s);
		//}
		
		System.out.println("===switch文での使用===");
		System.out.println("冬は" + birth(Seas.WINTER));
	}
	
	public static String birth(Seas s) {
		String str = "SPRING";
		switch(str) {
		case "SPRING":
			return "3月～5月です。";
		case "SUMMER":
			return "6月～8月です。";
		case "AUTUMN":
			return "9月～11月です。";
		case "WINTER":
			return "12月～2月です。";
		default:
			throw new AssertionError(s + "はありません");
		}
	}
}
