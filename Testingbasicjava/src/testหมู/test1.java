package testหมู;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
System.out.print("ใส่ค่าแบงค์ที่ต้องการทราบสี = ");
int bank = kb.nextInt();
if(bank == 20 ){
	System.out.print("เขียว");
}
else if (bank == 50){
	System.out.print("ฟ้า");
}
else if (bank == 100){
	System.out.print("แดง");
}
else if (bank == 500){
	System.out.print("ม่วง");
}
else if (bank == 1000){
	System.out.print("เทา");
}
else {
	System.out.print("Error");
}
	}

}
