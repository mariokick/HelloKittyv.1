package testพลอย;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.print("เมนู ที่ 1 วันจันทร์ \n"
		+ "เมนู ที่ 2 วันอังคาร \n"
		+ "เมนู ที่ 3 วันพุธ \n"
		+ "เมนู ที่ 4 วันพฤหัสบดี \n"
		+ "เมนู ที่ 5 วันศุกร์ \n"
		+ "เมนู ที่ 6 วันเสาร์ \n"
		+ "เมนู ที่ 7 วันอาทิตย์");
String menu = kb.next();
switch(menu){
case "1" : System.out.println("วิชา คณิตศาสตร์"); 
break;
case "2" : System.out.println("วิชา ไทย "); 
break;
case "3" : System.out.println("วิชา สังคม "); 
break;
case "4" : System.out.println("วิชา อังกฤษ"); 
break;
case "5" : System.out.println("วิชา คณิตเพิ่มเติม"); 
break;
case "6" : System.out.println("วิชา วิทยาศาสตร์"); 
break;
case "7" : System.out.println("วิชา อังกฤษเพิ่มเติม	"); 
break;
default: System.out.println("ใส่วันไม่ถูกต้อง");;
}
	}

}
