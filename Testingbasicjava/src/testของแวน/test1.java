package test�ͧ�ǹ;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.print("�ô���ӹǹ�Թ =");
int money = kb.nextInt();
if(money>=40){
	System.out.println("�������ʹ���");
}
else if(money >=30){
	System.out.println("��������");
}
else if(money >=20){
	System.out.println("������ٹԵ");
	
}
else {
	System.out.println("Error");
}
	}

}
