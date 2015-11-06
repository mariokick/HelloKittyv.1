package testËÁÙ;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("Input Number:	");
		int x =0;
		x = kb.nextInt();
		int Sum = 0;
		
		int i = 1;
		while(i<=12){
			Sum = x * i;
			System.out.println(x + " * " + i + " = " + Sum);
			i++;
		}
	}

}