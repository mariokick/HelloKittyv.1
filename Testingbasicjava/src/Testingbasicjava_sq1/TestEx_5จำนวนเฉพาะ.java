package Testingbasicjava_sq1;
import java.util.Scanner;
public class TestEx_5จำนวนเฉพาะ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
int fac = 0 ;
int x =kb.nextInt();
for(int i =1;i<=x;i++){
	if(x %i==0){
		fac++;
	}
	
}
if(fac==2){
	System.out.println("จำนวนเฉพาะ");
}
else 
	System.out.println("ไม่ใช่เฉพาะ");
	}

}
