package testหมู;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		int menu =kb.nextInt();
		switch(menu){
		case 20 :  System.out.print("เขียว");
		break;
		case 50 : System.out.print("ฟ้า");
		break;
		case 100 :  System.out.print("แดง");
		break;
		case 500 :  System.out.print("ม่วง");
		break;
		case 1000 :  System.out.print("เทา");
		break;
		default: System.out.println("ใส่จำนวนไม่ถูกต้อง");;
		}
	}

}
