package test����;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.print("���� ��� 1 �ѹ�ѹ��� \n"
		+ "���� ��� 2 �ѹ�ѧ��� \n"
		+ "���� ��� 3 �ѹ�ظ \n"
		+ "���� ��� 4 �ѹ����ʺ�� \n"
		+ "���� ��� 5 �ѹ�ء�� \n"
		+ "���� ��� 6 �ѹ����� \n"
		+ "���� ��� 7 �ѹ�ҷԵ��");
String menu = kb.next();
switch(menu){
case "1" : System.out.println("�Ԫ� ��Ե��ʵ��"); 
break;
case "2" : System.out.println("�Ԫ� �� "); 
break;
case "3" : System.out.println("�Ԫ� �ѧ�� "); 
break;
case "4" : System.out.println("�Ԫ� �ѧ���"); 
break;
case "5" : System.out.println("�Ԫ� ��Ե�������"); 
break;
case "6" : System.out.println("�Ԫ� �Է����ʵ��"); 
break;
case "7" : System.out.println("�Ԫ� �ѧ����������	"); 
break;
default: System.out.println("����ѹ���١��ͧ");;
}
	}

}
