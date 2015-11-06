package Menu;
import java.util.Scanner;
public class testwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.print("โปรดใส่แม่สูตรที่ต้องการทราบ  = ");
int m = kb.nextInt();
int sum= 0 ;
int i = 1 ;
while( i<=12){
	sum= m*i ; 
	System.out.println(m+" * "+i+" = "+sum);
	i++;
}

		
	}
}