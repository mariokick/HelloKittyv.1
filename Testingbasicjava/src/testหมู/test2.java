package test���;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("����Թ��͹������Ѻ = ");
		int money = kb.nextInt();
		int money1 = 0 ;
		int sum =0 ;
		for(int i =1; i<=12;i++){
			System.out.println(sum);
			sum = money+money1 ;
			money1 = sum;
		}
		System.out.println("�Թ��͹������������Ѻ = "+sum);
	}

}
