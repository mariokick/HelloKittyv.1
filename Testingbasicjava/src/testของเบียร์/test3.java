package testของเบียร์;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("โปรดเลือกสูตรที่ต้องการทราบ = ");
		int number = kb.nextInt();
		int sum = 0 ;
		for(int i=1;i<=12;i++){
			sum = number * i ;
			System.out.println(number+" * "+i+" = "+sum);
		}
	}

}
