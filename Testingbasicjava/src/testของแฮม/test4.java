package test¢Í§áÎÁ;

import java.util.Scanner;

public class test4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("ãÊè¤Ðá¹¹");
		int point = kb.nextInt();
		if(point >=80){
			System.out.print("A");
		}
		else if (point >=70){
			System.out.print("B");
		}
		else if (point >=60){
			System.out.print("C");
		}
		else if (point >=50){
			System.out.print("D");
			
		}
		else {
			System.out.println("F");
		}
	}

}

	