package test�ͧ�ǹ;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("�Ҥҹ���秪�Դ��ҧ� \n" + "���� 1 ����秺�\n"
				+ "���ٷ�� 2 ��������\n" + "���ٷ�� 3 ��������\n" +  "���ٷ�� 4 ������ٹԵ\n"+"�ô������ٷ���ҹ���͡ = ");
		String menu = kb.next();
switch(menu){
case "1":   System.out.println("50 �ҷ / 1 ���š���");;
break;
case "2" :  System.out.println("40 �ҷ / 1 ���š���");;
break;
case "3" :  System.out.println("30 �ҷ / 1 ���š���");;
break;
case "4" :  System.out.println("20 �ҷ / 1 ���š���");;
break;
default: System.out.println("Error");;
}
	}

}
