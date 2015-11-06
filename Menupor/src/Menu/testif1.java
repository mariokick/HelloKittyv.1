package Menu;
import java.util.Scanner;
public class testif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
System.out.print("โปรดใส่คะแนนของคุณ = ");
int g =kb.nextInt();


	

 if(g>=80){
	System.out.println("A");
}
else if (g>=70){
	System.out.println("B");
}
else if (g>=60){
	System.out.println("C");
}
else if (g>=50){
	System.out.println("D");
}
else{
	System.out.println("F");
}
	
	
}
}
