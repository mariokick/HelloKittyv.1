package Menu;
import java.util.Scanner;
public class Project {
/*เมนูที่ 1= สำหรับแสดงผลลัพจากการบวกลบคูณหาร จากค่าที่ผุ้ใช้ใส่ a b sum
	เมนูที่ 2= แสดงแม่สูตรคูณจากค่าที่ผู้ใช้ใส่
			เมนูที่ 3=คำนวณเกรดที่ได้จาก คะแนนที่ใส่เข้าไป
			เมนูที่ 4=แสดงอัตราแลกเปลี่ยนสกุลเงินนจากค่าที่ใส่
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new  Scanner(System.in);


double sum = 0 ;
//int m =kb.nextInt();
//double g =kb.nextDouble();

short menu = 0;
	
while(menu < 5){
System.out.print("เลือกเมนูที่ต้องการ \n"
		+ "เมนู 1 สำหรับการแสดงผลลัพจากการบวกลบคูณหาร\n"
		+ "เมนู 2 แส4ดงเแม่สูตรคูณจากค่าที่ผู้ใช้ใส่\n"
		+ "เมนู 3 คำนวณเกรดที่ได้จาก คะแนนที่ใส่เข้าไป\n"
		+ "เมนู 4 แสดงอัตราแลกเปลี่ยนสกุลเงินจากค่าที่ใส่\n"
		+ "เมนู 5 ยกเลิกคำสั่ง "
		+ "โปรดใส่เมนูที่ต้องการ = ");

 menu = kb.nextShort();


switch(menu){
case 1 :  
	System.out.print("โปรดใส่ค่าที่ 1 = "); 
		double a  =kb.nextDouble();
		System.out.print("โปรดใส่ค่าที่ 2 = "); 
		double b  =kb.nextDouble();
		System.out.print("โปรดเลือก 1 บวก 2 ลบ 3 คูณ 4 หาร =");
		short menu1 = kb.nextShort();
		switch(menu1){
		case 1 : sum = a+b ;
		System.out.println("ผลลัพท์ของ "+a+"+"+b+"= : "+sum);
		break;
		case 2 : sum = a-b ;
		System.out.println("ผลลัพท์ของ "+a+"-"+b+"= : "+sum);
		break;
		case 3 : sum = a*b ;
		System.out.println("ผลลัพท์ของ "+a+"*"+b+"= : "+sum);
		break;
		case 4 : sum = a/b ;
		System.out.println("ผลลัพท์ของ "+a+"/"+b+"= : "+sum);
		break;
		}			
break;

case 2 : System.out.print("โปรดใส่แม่สูตรคูณที่ต้องการ = ");
int m =kb.nextInt();
int sum1 = 0 ;
for(int i=1;i<=12;i++){
sum1 = m * i ;
System.out.println(m+" * "+i+" = "+sum1);
}
break;
case 3 : System.out.print("โปรดใส่เกรดของคุณ");
double g =kb.nextDouble();
if(g >= 80){
	System.out.println(" เกรด A ");
}
else if (g>=70){
	System.out.println(" เกรด B");
}
else if (g>=60){
	System.out.println(" เกรด C");
}
else if (g>=50){
	System.out.println(" เกรด D");
}
else{
	System.out.println(" เกรด F");
}
break;

case 4 :
	
	System.out.print("สกุลเงินที่ต้องการทราบอัตราแลกเปลี่ยน : \n"
			+ "เมนู 1 = สกุลเงินญี่ปุ่น\n"
			+ "เมนู 2 = สกุลเงินพม่า\n"
			+ "เมนู 3 = สกุลเงินไทย\n "
			+ "โปรดเมนูที่ต้องการ = ");
	int menu2=kb.nextInt();
	switch(menu2){
	case 1: System.out.println("สกุลเงินญี่ปุ่น = เยน");
	break;
	case 2: System.out.println("สกุลเงินพม่า  = พม่า ");
	break;
	case 3: System.out.println("สกุลเงินไทย   = บาท ");
	break;
	}
	
break;
}

}
System.out.println("ขอบคุณที่ใช้บริการ");
	}
}
