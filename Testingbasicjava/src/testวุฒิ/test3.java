package testวุฒิ;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb =new Scanner(System.in);
for(int i = 1 ;i<=3;i++){
System.out.print("ใส่เลขที่ต้องการครั้งที่ "+i+" = ");
int number = kb.nextInt();
if(number%2 == 1){
	System.out.println("เป็นเลขคี่");
}
else {
	System.out.println("เป็นเลขคู่");
}
}
	}

}
