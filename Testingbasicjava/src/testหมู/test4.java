package testหมู;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		int password ;
		do{
		System.out.print("โปรดใส่ password ให้ถูกต้อง = " );
			password= kb.nextInt();
		}while(password !=1234);
		System.out.println("รหัสผ่านถูกต้อง");
		
	}

}
