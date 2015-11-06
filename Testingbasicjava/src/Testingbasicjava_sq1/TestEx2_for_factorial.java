package Testingbasicjava_sq1;
import java.util.Scanner;
public class TestEx2_for_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("ใส่ค่า Factorial ที่ต้องการทราบ = ");
long n =  kb.nextLong() ;
long sum = 1  ;
for(long i=n;i>=1;i--){
	sum *=i	;
}
System.out.println("Factorial = "+sum);
	}

}
