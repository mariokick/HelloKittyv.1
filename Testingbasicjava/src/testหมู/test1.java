package test���;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
System.out.print("�����ầ�����ͧ��÷�Һ�� = ");
int bank = kb.nextInt();
if(bank == 20 ){
	System.out.print("����");
}
else if (bank == 50){
	System.out.print("���");
}
else if (bank == 100){
	System.out.print("ᴧ");
}
else if (bank == 500){
	System.out.print("��ǧ");
}
else if (bank == 1000){
	System.out.print("��");
}
else {
	System.out.print("Error");
}
	}

}
