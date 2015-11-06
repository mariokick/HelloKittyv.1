package testของแวน;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.print("โปรดใส่จำนวนเงิน =");
int money = kb.nextInt();
if(money>=40){
	System.out.println("น้ำแข็งหลอดเล็ก");
}
else if(money >=30){
	System.out.println("น้ำแข็งมือ");
}
else if(money >=20){
	System.out.println("น้ำแข็งยูนิต");
	
}
else {
	System.out.println("Error");
}
	}

}
