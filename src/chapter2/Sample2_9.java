package chapter2;

public class Sample2_9 {
	public static void main(String[] args) {
		int i = 2;
		String s = "秋";
		switch(s) {
		case "春":
			System.out.println("SPRING");
			break;
		case "夏":
			System.out.println("SUMMER");
			break;
		case "秋":
			System.out.println("AUMTUMN");
			break;
		case "冬":
			System.out.println("WINTER");
			break;
		default:
			System.out.println("iは1でも2でもありません。");
		}
	}
}
