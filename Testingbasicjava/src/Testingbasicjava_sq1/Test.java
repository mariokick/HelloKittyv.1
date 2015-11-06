package Testingbasicjava_sq1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		if (k % 2 != 1) {
			System.out.println("เฉพาะ");
		} else
			System.out.println("ไม่เฉพาะ");
	}

}
