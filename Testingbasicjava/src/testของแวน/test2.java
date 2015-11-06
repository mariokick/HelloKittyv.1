package testของแวน;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("ราคาน้ำแข็งชนิดต่างๆ \n" + "เมนู 1 น้ำแข็งบด\n"
				+ "เมนูที่ 2 น้ำแข็งมือ\n" + "เมนูที่ 3 น้ำแข็งมือ\n" +  "เมนูที่ 4 น้ำแข็งยูนิต\n"+"โปรดใส่เมนูที่ท่านเลือก = ");
		String menu = kb.next();
switch(menu){
case "1":   System.out.println("50 บาท / 1 กิโลกรัม");;
break;
case "2" :  System.out.println("40 บาท / 1 กิโลกรัม");;
break;
case "3" :  System.out.println("30 บาท / 1 กิโลกรัม");;
break;
case "4" :  System.out.println("20 บาท / 1 กิโลกรัม");;
break;
default: System.out.println("Error");;
}
	}

}
