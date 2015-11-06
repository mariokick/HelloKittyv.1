package J4Test;
import java.util.Scanner;
public class TestBankAccout {
	public static void main(String[] args) {
		
BankAccout acc1 = new BankAccout();
BankAccout acc2 = new BankAccout(1240.50);
System.out.println(acc1.showBalance());
System.out.println(acc2.showBalance());
acc1.deposit(300);
acc2.transfer(acc1,100);
acc2.widthdraw(100);
System.out.println(acc1.showBalance());
System.out.println(acc2.showBalance());	
	}

}
/*Scanner kb = new Scanner(System.in);
double amount = 0.0;
String User = "";

int menu = 0;
System.out.print("เลือกเมนู\nฝากเงิน กด 1 \nถอนเงิน กด 2 \nยกเลิก กด 3 \nกรุณาใส่หมายเลขที่ต้องการทำรายการ = ");
menu =kb.nextInt();
switch(menu)
{
case 1:

	break;
case 2:
	
	break;
case 3: 
	break;
}*/