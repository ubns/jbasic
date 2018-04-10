package chapter2;

import java.util.Scanner;

public class Sample1_7 {
	public static void main(String[] args) {
		System.out.print("なにか入力して：");
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		
		scan.close();
		System.out.println("あはは " + data);
	}
}
