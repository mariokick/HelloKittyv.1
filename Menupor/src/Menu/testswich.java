package Menu;
import java.util.Scanner;
public class testswich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
int menu =kb.nextInt();		
switch(menu){
case 1 : System.out.println("มกราคม");
break;
case 2 : System.out.println("กุมภาพันธ์");
break;
case 3 : System.out.println("มีนาคม");
break;
case 4 : System.out.println("เมษายน");
break;
case 5 : System.out.println("พฤษภาคม");
break;
case 6 : System.out.println("มิถุนายน");
break;
case 7 : System.out.println("กรกฎาคม");
break;
case 8 : System.out.println("สิงหาคม");
break;
case 9 : System.out.println("กันยายน");
break;
case 10 :System.out.println("ตุลาคม");
break;
case 11: System.out.println("พฤศจิกายน");
break;
case 12: System.out.println("ธันวาคม");
break;
}
	}

}
